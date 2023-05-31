package math;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class ArithmeticOperationsTest {

  ArithmeticOperations ao = new ArithmeticOperations();

  /*
   * A unit test that checks an invalid zero input
   * that causes an ArithmeticException
   */
  @Test(expected = ArithmeticException.class)
  public void test_divide_zero_exception() {
    ao.divide(3, 0);
  }

  /*
   * Some unit tests that check valid inputs
   * and expect specific results
   */

  @Test
  public void test_divide_should_return_one() {
    double result = ao.divide(3, 3);
    double delta = 0.0001;
    double expected = 1;
    Assert.assertEquals(expected, result, delta);
  }

  @Test
  public void test_divide_should_return_minus_two() {
    double result = ao.divide(6, -3);
    double delta = 0.0001;
    double expected = -2;
    Assert.assertEquals(expected, result, delta);
  }

  @Test
  public void test_divide_should_return_two() {
    double result = ao.divide(-6, -3);
    double delta = 0.0001;
    double expected = 2;
    Assert.assertEquals(expected, result, delta);
  }

  /*
   * A unit test that checks a valid positive input and
   * a valid negative input and
   * expects a negative result
   */

  @Test
  public void test_divide_should_return_negative() {
    Assert.assertTrue(ao.divide(3, -6) < 0);
  }

  /*
   * A unit test that checks valid negative inputs and
   * expects a positive result
   */
  @Test
  public void test_divide_should_return_positive_negatives() {
    Assert.assertTrue(ao.divide(-7, -8) > 0);
  }

  /*
   * A unit test that checks valid positive inputs and
   * expects a positive result
   */
  @Test
  public void test_divide_should_return_positive() {
    Assert.assertTrue(ao.divide(3.444, 5.342) > 0);
  }


  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /*
   * A unit test that checks an invalid/negative y input
   * that causes an IllegalArgumentException and
   * specifies the exception message
   */
  @Test
  public void test_multiply_negative_exception_y() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("x & y should be >= 0");
    ao.multiply(0, -1);
  }

  /*
   * A unit test that checks an invalid/negative x input
   * that causes an IllegalArgumentException and
   * specifies the exception message
   */
  @Test
  public void test_multiply_negative_exception_x() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("x & y should be >= 0");
    ao.multiply(-1, 4);
  }

  /* A unit test that checks invalid/negative x and y inputs
   * that causes an IllegalArgumentException and
   * specifies the exception message
   */
  @Test
  public void test_multiply_negative_exception_both() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("x & y should be >= 0");
    ao.multiply(-7, -1);
  }


  /*
   * A unit test that checks an invalid input
   * that causes an IllegalArgumentException of
   * integer overflow and specifies the
   * exception message
   */
  @Test
  public void test_multiply_integer_overflow_exception() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("The product does not fit in an Integer variable");
    ao.multiply(2147483647, 2); // As the value of Integer.MAX_VALUE = 2147483647
  }

  /*
   * A unit test that checks a valid zero input in y variable
   * and a non zero input in x variable and returns
   * zero as result.
   */
  @Test
  public void test_multiply_y_equals_zero() {
    Assert.assertEquals(0, ao.multiply(234, 0));
  }

  /*
   * A unit test that checks a valid zero input in x variable
   * and a non zero input in y variable and returns
   * zero as result.
   */
  @Test
  public void test_multiply_x_equals_zero() {
    Assert.assertEquals(0, ao.multiply(0, 9));
  }

  /*
   * A unit test that checks valid zero inputs in both x and y variables
   * and returns zero as result
   */

  @Test
  public void test_multiply_arithmetic_both_equal_zero() {
    Assert.assertEquals(0, ao.multiply(0, 0));
  }

  /*
   * A unit test that check valid inputs
   * and expects specific result nine
   */
  @Test
  public void test_multiply_should_return_nine() {
    Assert.assertEquals(9, ao.multiply(3, 3));
  }

  /*
   * A unit test that checks valid positive inputs and
   * expects a positive result
   */
  @Test
  public void test_multiply_should_return_positive() {
    Assert.assertTrue(ao.multiply(1, 1298) > 0);
  }
}
