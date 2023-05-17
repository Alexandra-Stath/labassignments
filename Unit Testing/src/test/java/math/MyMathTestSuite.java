package math;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A class used as a holder of the @RunWith and @Suite
 * annotations, necessary when someone needs to group
 * classes that include tests, for demonstrating Unit Testing.
 * @author AlexandraStathopoulou
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class,MyMathParameterizedTest.class})

public class MyMathTestSuite {

  // this class remains empty, it is used as a holder of above annotations.

}
