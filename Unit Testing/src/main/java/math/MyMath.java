package math;

/**
 * The MyMath provides the simple arithmetic calculation of the factorial and prime
 * acknowledgement of a given number n that serve as hands-on practice on Unit Testing.
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
      throw new IllegalArgumentException("n should be >=0 and <=12"); // the variable should be between the values of 0 and 12
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

  /**
   * Performs basic calculations in order  to acknowledge if a given number is prime.
   * @param n is the input number of the operation
   * @return the boolean result of if the number is prime or not
   * @exception IllegalArgumentException when the input is less than 2
   */

  public boolean isPrime (int n) {
    if (n < 2) {
      throw new IllegalArgumentException("n should be >=2");
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
