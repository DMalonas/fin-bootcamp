import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockTest1 {

    @Test
    public void whenGetCalled_ReturnFirstElement() {

        // Arrange
        List mockedList = Mockito.mock(List.class);
        Mockito.when(mockedList.get(0)).thenReturn("first element");

        // Act
        String result = (String) mockedList.get(0);

        // Assert
        assertEquals("first element", result);
    }


}
