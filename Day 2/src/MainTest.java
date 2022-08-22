import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Compare two boolean statements")
    void compareBoolean() {
        assertFalse(Main.compareBoolean(true, false));
        assertFalse(Main.compareBoolean(false, true));
        assertTrue(Main.compareBoolean(true, true));
    }

    @Test
    @DisplayName("Is the number even?")
    void evenOrOdd1() {
        assertAll(()-> assertEquals(true, Main.evenOrOdd1(10)), // can shorten it to assertFalse and assertTrue
                ()-> assertEquals(true, Main.evenOrOdd1(78)), // assertEquals is better for values instead of boolean
                ()-> assertEquals(false, Main.evenOrOdd1(15)),
                ()-> assertEquals(false, Main.evenOrOdd1(13)));
    }

    @Test
    @DisplayName("Is the number odd?")
    void evenOrOdd2() {
        assertFalse(Main.evenOrOdd2(10));
        assertTrue(Main.evenOrOdd2(7));
    }

    @Test
    @DisplayName("The opposite of given boolean")
    void booleanOpposite() {
        assertFalse(Main.booleanOpposite(true));
        assertTrue(Main.booleanOpposite(false));
    }

    @Test
    @DisplayName("(a==b) || (a<0 && b>0) || (a>100 && b>100)")
    void integerTrue() {
        assertAll(()-> assertEquals(false, Main.integerTrue(-1, -2)),
                ()-> assertEquals(true, Main.integerTrue(-2, 1)),
                ()-> assertEquals(true, Main.integerTrue(-1, -1)),
                ()-> assertEquals(true, Main.integerTrue(101, 102)),
                ()-> assertEquals(false, Main.integerTrue(99, 200)));
    }
}