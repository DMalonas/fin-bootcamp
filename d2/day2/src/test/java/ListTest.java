import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListTest {
    private List<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void testAddItem() {
        list.add("item");
        assertTrue(list.contains("item"));
    }

    @AfterEach
    void tearDown() {
        list.clear();
    }
}

