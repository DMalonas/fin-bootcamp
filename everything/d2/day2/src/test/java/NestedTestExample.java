import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedTestExample {

    @Nested
    class AddTest {
        @Test
        void testAdditionPositive() {
            assertEquals(2, Integer.sum(1, 1));
        }

        @Test
        void testAdditionNegative() {
            assertEquals(-2, Integer.sum(-1, -1));
        }
    }

    @Nested
    class SubtractTest {
        @Test
        void testSubtraction() {
            assertEquals(0, Integer.sum(1, -1));
        }
    }
}

