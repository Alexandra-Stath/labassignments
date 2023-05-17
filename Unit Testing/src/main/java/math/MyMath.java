package math;

/**
 * The MyMath provides the simple arithmetic calculation of the factorial of a given number n
 * that serve as hands-on practice on Unit Testing.
 *
 * @author  AlexandraStathopoulou
 * @since  13th of May 2023
 */
public class MyMath {

  /**
   * Performs the basic calculation of the factorial arithmetic operation.
   * @param n is the input number of the operation
   * @return the result of the factorial multiply of the integer n
   * @exception IllegalArgumentException when the input is either less than 0 or over 12
   */

  public int factorial (int n) {
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException( "n should be >=0 and <=12"); // the variable should be between the values of 0 and 12
    } else {
      int result = 1;
      int i = 1;
      while (i <= n) {
        result = result * i;
        i++;
      }
      return result;
    }
  }
}
