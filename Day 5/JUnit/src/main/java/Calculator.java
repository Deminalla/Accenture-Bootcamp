import java.util.stream.DoubleStream;

/*
Only things to do in “@Test testA(){...}” methods is business logic + assertions
Each test method gets called exactly once in some order (test methods should be isolated, so the
order does not matter)

@BeforeClass
run before the first test method in the current class is invoked

@AfterClass
run after all the test methods in the current class have been run

@Before public void setUp() {...}
gets called before each test method is executed

@After public void tearDown() {...}
gets called after each test method has been executed – regardless of whether the test passed or failed (or threw some other exception)
 */

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}