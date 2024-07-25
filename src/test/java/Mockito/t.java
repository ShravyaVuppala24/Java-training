package Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class t {
    @Mock
    private MathService mathService;

    @InjectMocks
    private Calc calculator;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAdd() {
        // Define behavior
        when(mathService.add(2, 3)).thenReturn(5);

        // Call the method under test
        int result = calculator.add(2, 3);

        // Verify the result
        assertEquals(5, result);

        // Verify interaction
        verify(mathService).add(2, 3);
    }
}

