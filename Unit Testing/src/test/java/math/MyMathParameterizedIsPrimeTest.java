package math;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * A class that provides parameterized test cases for
 * MyMath isPrime method, for demonstrating Unit Testing.
 * @author AlexandraStathopoulou
 */
@RunWith(Parameterized.class)
public class MyMathParameterizedIsPrimeTest {

  @Parameter(value = 0)
      public int n;
  @Parameter(value = 1)
      public boolean result;

  MyMath mm = new MyMath();

  /*
   * The following method generates the input values
   * for the tests.
   */

  @Parameters
  public static Collection<Object[]> data() {
    Object[][] data = new Object[][]{{2,true}, {3,true}, {4,false}, {11,true}, {33,false}, {89,true}};
    return Arrays.asList(data);
  }

  /*
   * A unit test that checks parameterized valid inputs and
   * expects specific results for the isPrime method in
   * MyMath class
   */
  @Test
  public void test_isPrime_with_input() {
    Assert.assertEquals(result, mm.isPrime(n));
  }
}
