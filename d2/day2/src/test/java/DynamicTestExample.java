import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class DynamicTestExample {

    @TestFactory
    Stream<DynamicTest> translateDynamicTestsFromStream() {
        return Stream.of("apple", "banana", "cherry")
                .map(word -> dynamicTest("Test translate " + word, () -> {
                    assertTrue(translate(word).contains("trans"));
                }));
    }

    String translate(String input) {
        return "trans-" + input;
    }
}

