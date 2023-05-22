package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * A class that provides test cases and exception tests for
 * MyMath factorial method, for demonstrating Unit Testing.
 * @author AlexandraStathopoulou
 */
public class MyMathTest {
  MyMath mm = new MyMath();

  /*
   * A unit test that checks an invalid/positive n input
   * under two that causes an IllegalArgumentException
   * exception
   */
  @Test(expected = IllegalArgumentException.class)
  public void test_isPrime_exception_under_two() {
    mm.isPrime(1);
  }

  /*
   * A unit test that checks an invalid/negative n input
   * under two that causes an IllegalArgumentException
   * exception
   */
  @Test(expected = IllegalArgumentException.class)
  public void test_isPrime_exception_negative() {
    mm.isPrime(-1);
  }


  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /*
   * A unit test that checks an invalid/positive n input
   * over twelve that causes an IllegalArgumentException
   * exception
   */
  @Test
  public void test_factorial_exception_over() {
    thrown.expect(IllegalArgumentException.class);
    mm.factorial(13);
  }

  /*
   * A unit test that checks an invalid/negative n input
   * under zero that causes an IllegalArgumentException
   * exception
   */
  @Test
  public void test_factorial_exception_under() {
    thrown.expect(IllegalArgumentException.class);
    mm.factorial(-1);
  }
}
