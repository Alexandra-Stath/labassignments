package math;

import io.FileIO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayOperationsTest {

    ArrayOperations ao = new ArrayOperations();
    MyMath mm = new MyMath();
    FileIO io = new FileIO();
    public static String resourcePath = "src/test/resources/";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /*
     * A unit test that checks an empty txt file input in the
     * findPrimeInFile method that causes an
     * IllegalArgumentException thrown by FileIO class and
     * specifies the exception message
     */
    @Test
    public void test_findPrimeInFile_exception_empty_file() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Given file is empty");
        ao.findPrimesInFile(io, resourcePath.concat("empty.txt"), mm);
    }

    /*
     * A unit test that checks a nonexistent txt file input in the
     * findPrimeInFile method that causes an
     * IllegalArgumentException thrown by FileIO class and
     * specifies the exception message
     */
    @Test
    public void test_findPrimeInFile_exception_nonexistent_file() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input file does not exist");
        ao.findPrimesInFile(io, resourcePath.concat("nonexistent.txt"), mm);
    }

    /*
     * A unit test that checks an existing txt file input in the
     * findPrimeInFile method that causes an
     * IllegalArgumentException thrown by IsPrime method of
     * MyMath class because the input entries equal and/or
     * are under 2 and specifies the exception message
     */
    @Test
    public void test_findPrimeInFile_exception_under_two() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >=2");
        ao.findPrimesInFile(io, resourcePath.concat("exampleFile.txt"), mm);
    }

    /*
     * A unit test that checks an existing txt file input in the
     * findPrimeInFile method that causes an
     * IllegalArgumentException thrown by IsPrime method of
     * MyMath class because the input entries are negative
     * and/or are under 2 and specifies the exception message
     */
    @Test
    public void test_findPrimeInFile_exception_contains_negative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >=2");
        ao.findPrimesInFile(io, resourcePath.concat("containsNegative.txt"), mm);
    }

    /*
     * A unit test that checks an existing and valid txt file input
     * in the findPrimeInFile method that causes an
     * IllegalArgumentException thrown by findPrimeInFile method
     * as no prime number is found and specifies the exception
     * message
     */
    @Test
    public void test_findPrimeInFile_exception_notFound() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("No prime numbers found");
        ao.findPrimesInFile(io, resourcePath.concat("noPrimes.txt"), mm);
    }
    /*
     * A unit test that checks an existing and valid txt file input
     * (that contains integer, string and/or double type
     * lines) in the findPrimeInFile method that expects a specific array
     * as a result
     */
    @Test
    public void test_findPrimeInFile_normal_file() {
        int[] expectedArray = {113, 11, 7};
        int[] actualArray = ao.findPrimesInFile(io, resourcePath.concat("invalidEntries.txt"), mm);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    /*
     * A unit test that checks an existing and valid txt file input
     * (that contains integer, string and/or double type
     * lines) in the findPrimeInFile method that expects a specific array
     * as a result
     */
    @Test
    public void test_findPrimeInFile_normal_file_2() {
        int[] expectedArray = {13};
        int[] actualArray = ao.findPrimesInFile(io, resourcePath.concat("normalFile.txt"), mm);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
