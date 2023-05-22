package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;

/**
 * The ArrayOperations class provides a cooperation between thw MyMath class and the
 * FileIO in order to practice Unit Testing
 *
 * @author  AlexandraStathopoulou
 * @since  22nd of May 2023
 */
public class ArrayOperations {

    /**
     * Performs the act of checking for prime numbers imported from a random txt file.
     * @param fileIo the class FileIO
     * @param filepath string value of the input txt file path
     * @param myMath the class MyMath
     * @return an array of integers that are prime as imported by readFile method
     * of FileIO class and checked by isPrime method of MyMath class
     */
    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
        List<Integer> primeNumbers = new ArrayList<>();
        int[] numbers = FileIO.readFile(filepath);

        for (int number : numbers) {
            if (myMath.isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        int[] primeArray = new int[primeNumbers.size()];
        for (int i = 0; i < primeNumbers.size(); i++) {
            primeArray[i] = primeNumbers.get(i);
        }

        return primeArray;
    }
}
