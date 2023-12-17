import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.provider.Arguments;

public class PalindromeTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testPalindrome(String candidate, String secondCandidate) {
        assertTrue(isPalindrome(candidate));
        assertTrue(isPalindrome(secondCandidate));
    }

    private static Stream<Arguments> stringProvider() {
        List<String> primaryCandidates = List.of("racecar", "civic");
        List<String> secondaryCandidates = List.of("civic", "kayak", "rotor", "deified");

        return primaryCandidates.stream()
                .flatMap(primary -> secondaryCandidates.stream()
                        .map(secondary -> Arguments.of(primary, secondary)));
    }

    private boolean isPalindrome(String input) {
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}
