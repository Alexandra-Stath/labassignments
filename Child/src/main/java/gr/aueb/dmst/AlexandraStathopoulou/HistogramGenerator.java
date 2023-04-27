package gr.aueb.dmst.AlexandraStathopoulou;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/***
 * @author AlexandraStathopoulou
 * The purpose of the class is to create, generate and present the image of the frequency histogram.
 * This is generated based on a grades file given by the user inputing the files full path and is
 * carried out by the GetChart method.
 * @since April 2023
 */

public class HistogramGenerator {

  public static void main(String[] args) {

    BufferedReader reader;
    int counter = 0;
    String line;
    String filename = null;

    // We have to count the number of entries of the grades to make the array

    try {

      // We ask the user to enter the file path and check if it exists in the repository

      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter the path of the file:");
      filename = myObj.nextLine();
      reader = new BufferedReader(new FileReader(filename));

      line = reader.readLine();

      while (line != null) {
        line = reader.readLine();
        counter++;
      }

      reader.close();
    } catch (Exception e) {
      // If the path of the file is not valid do not execute the code

      System.out.println("The path or name of the file is not valid.");
      System.exit(1);
    }

    //Knowing the number of entries in the file we store the number of values in the grades array.


    String[] grades = new String[counter];
    int[] grd = new int[counter];
    try {
      int i = 0;
      reader = new BufferedReader(new FileReader(filename));
      line = reader.readLine();
      while (i < counter) {
        grades[i] = line;
        grd[i] = Integer.parseInt(grades[i]);
        i++;
        line = reader.readLine();
      }
      reader.close();
    } catch (Exception e) {
//            e.printStackTrace();
    }

    HistogramGenerator demo = new HistogramGenerator();
    demo.getChart(grd);

  }

  /***
   * The method getChart receives a single dimension Integer array grd. From this array the dataset
   * that will be used for the visualization is generated. Finally, The chart
   * is generated with the use of the aforementioned dataset and then
   * presented in the screen.
   *
   * @param grd Single dimension integer array
   */

  public void getChart(int[] grd) {
    XYSeriesCollection dataset = new XYSeriesCollection();
    XYSeries data = new XYSeries("random values");

    Arrays.sort(grd);

    for (int i = 0; i < grd.length; i++) {
      int first_index = Arrays.binarySearch(grd, grd[i]);
      int last_index = Arrays.binarySearch(grd, grd[i]);

      while (first_index > 0 && grd[first_index - 1] == grd[i]) {
        first_index--;
      }

      while (last_index < grd.length - 1 && grd[last_index + 1] == grd[i]) {
        last_index++;
      }

      i = last_index;

      int fre = last_index - first_index + 1;
      data.add(grd[i], fre);
    }
    dataset.addSeries(data);
    boolean legend = false; // do not visualize a legend
    boolean tooltips = false; // do not visualize tooltips
    boolean urls = false; // do not visualize urls

    JFreeChart chart = ChartFactory.createXYLineChart("Grades Frequency", "grades",
        "frequency", dataset, PlotOrientation.VERTICAL, legend, tooltips, urls);

    // Initialize a frame for visualizing the chart and attach the previously created chart.

    ChartFrame frame = new ChartFrame("Histogram", chart);
    frame.pack();

    // Makes the previously created frame visible

    frame.setVisible(true);
  }
}