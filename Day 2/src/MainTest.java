import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Compare two boolean statements")
    void compareBoolean() {
        assertFalse(Main.compareBoolean(true, false));
        assertFalse(Main.compareBoolean(false, true));
        assertTrue(Main.compareBoolean(true, true));
    }

    @ParameterizedTest // execute this test method multiple times with different parameters
    @DisplayName("Is the number even?")
    @ValueSource(ints = {15, 3, 5, -3, 21}) // each time the test occurs it will pick a different value
    void evenOrOdd1(int oddNR) { // oddNR is a parameter to access values in valuesource
        assertAll(()-> assertEquals(true, Main.evenOrOdd1(10)),
                ()-> assertEquals(true, Main.evenOrOdd1(78)),
                ()-> assertEquals(false, Main.evenOrOdd1(oddNR)));
    }

    @Test
    @DisplayName("Is the number odd?")
    void evenOrOdd2() {
        int a = 10;
        assertFalse(Main.evenOrOdd2(a)); // can also create and use variables in test method
        assertTrue(Main.evenOrOdd2(7));
    }

    @Test
    @DisplayName("The opposite of given boolean")
    void booleanOpposite() {
        assertFalse(Main.booleanOpposite(true));
        assertTrue(Main.booleanOpposite(false));
    }

    @ParameterizedTest
    @CsvSource(value = {"-1,-2, -2, 1", // this way we can use multiple parameters
                        "99, 200, -1, -1"})
    @DisplayName("(a==b) || (a<0 && b>0) || (a>100 && b>100)")
    void integerTrue(int number1, int number2, int number3, int number4) {
        assertAll(()-> assertEquals(false, Main.integerTrue(number1, number2)), // can shorten it to assertFalse and assertTrue
                ()-> assertEquals(true, Main.integerTrue(number3, number4)));  // assertEquals is better for values instead of boolean
    }
}