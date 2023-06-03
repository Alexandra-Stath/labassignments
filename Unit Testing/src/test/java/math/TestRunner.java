package math;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

  public static void main (String[] args) {

    Result result = JUnitCore.runClasses(
        ArithmeticOperationsTest.class,
        MyMathParameterizedIsPrimeTest.class,
        MyMathParameterizedFactorialTest.class,
        MyMathTest.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.getMessage());
    }
    System.out.println("Tests completed successfully :: "
    + result.wasSuccessful());
  }

}
