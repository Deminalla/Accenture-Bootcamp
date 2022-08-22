import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2)); // will check if our method correctly adds 2 and 2
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() { // multiple assertions in a single test and execute all of them
        // assertAll is more convenient than multiple single assertions because you will always see a granular result rather than the result of the entire test.
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}