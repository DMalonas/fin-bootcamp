import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathOperationsTest {

    @Test
    void testAddition() {
        assertEquals(2, Integer.sum(1, 1), "1 + 1 should equal 2");
    }
}
