import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParameterizedExampleTest {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "level", "refer"})
    void testPalindrome(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

    private boolean isPalindrome(String input) {
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}

