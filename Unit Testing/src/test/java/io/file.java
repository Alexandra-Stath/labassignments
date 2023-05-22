package io;

public class file {

    public static void main (String[] args){
        FileIO fileio = new FileIO();
        String example = "C:\\Users\\30698\\Documents\\gitrepos\\labassignments\\Parent\\Unit Testing\\src\\test\\resources\\invalidEntries.txt";
        int result[] = fileio.readFile(example);
        System.out.println(result);
    }

}
