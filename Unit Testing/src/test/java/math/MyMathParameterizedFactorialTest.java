package math;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 * A class that provides parameterized test cases for
 * MyMath factorial method, for demonstrating Unit Testing.
 * @author AlexandraStathopoulou
 */
@RunWith(Parameterized.class)
public class MyMathParameterizedFactorialTest {

    @Parameter(value = 0)
    public int n;
    @Parameter(value = 1)
    public int result;
    MyMath mm = new MyMath();

    /*
     * The following method generates the input values
     * for the tests.
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};
        return Arrays.asList(data);
    }

    /*
     * A unit test that checks parameterized valid inputs and
     * expects specific results for the factorial method in
     * MyMath class
     */
    @Test
    public void test_factorial_with_input() {
        Assert.assertEquals(result, mm.factorial(n));
    }
}
