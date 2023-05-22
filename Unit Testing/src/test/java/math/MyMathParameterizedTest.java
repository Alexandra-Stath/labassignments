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
 * MyMath factorial and isPrime methods, for demonstrating Unit Testing.
 * @author AlexandraStathopoulou
 */
@RunWith(Parameterized.class)
public class MyMathParameterizedTest {

  @Parameter(value = 0)
      public int n;
  @Parameter(value = 1)
      public int result;
  @Parameter(value = 2)
      public int p;
  @Parameter(value = 3)
      public boolean cond;

  MyMath mm = new MyMath();

  /*
   * The following method generates the input values
   * for the tests.
   */
  @Parameters
  public static Collection<Object[]> data() {
    Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};
    return Arrays.asList(data);
  }

  @Parameters
  public static Collection<Object[]> prime() {
    Object[][] prime = new Object[][]{{2,true}, {3,true}, {4,false}, {11,true}, {33,false}, {89,true}};
    return Arrays.asList(prime);
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

  /*
   * A unit test that checks parameterized valid inputs and
   * expects specific results for the isPrime method in
   * MyMath class
   */
  @Test
  public void test_isPrime_with_input() {
    Assert.assertEquals(cond, mm.isPrime(p));
  }
}
