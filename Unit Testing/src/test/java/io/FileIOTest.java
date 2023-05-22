package io;

import java.io.File;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {
    FileIO io = new FileIO();
    public static String resourcePath = "src/test/resources/";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /*
     * A unit test that checks an empty txt file input
     * that causes an IllegalArgumentException and
     * specifies the exception message
     */
    @Test
    public void test_readFile_exception_empty_file() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Given file is empty");
        io.readFile(resourcePath.concat("empty.txt"));
    }

    /*
     * A unit test that checks a nonexistent txt file input
     * that causes an IllegalArgumentException and
     * specifies the exception message
     */
    @Test
    public void test_readFile_exception_nonexistent_file() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input file does not exist");
        io.readFile(resourcePath.concat("nonexistent.txt"));
    }

    /*
     * A unit test that checks a valid txt file input
     * of integers and expects a specific result
     */

    @Test
    public void test_readFile_normal_file() {
        int expectedArray[] = {1, 2, 4, 3, 2, 1};
        int actualArray[] = io.readFile(resourcePath.concat("exampleFile.txt"));
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    /*
     * A unit test that checks an invalid txt file input
     * that contains integer, string and/or double type
     * lines and fails unless the code is altered to
     * ignore non integer type values. If it ignores
     * these type of values (as it is done currently)
     * it passes.
     */
    @Test
    public void test_readFile_contains_invalid_entries() {
        int actualArray[] = io.readFile(resourcePath.concat("invalidEntries.txt"));
        if (!actualArray.getClass().getComponentType().equals(int.class)) {
            Assert.fail();
        }
    }

}