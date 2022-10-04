package main;

import main.mocking.Calculator;
import main.mocking.CalculatorService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(value = {MockitoExtension.class})
class solutionTest {

    static Calculator c;

    static CalculatorService service = mock(CalculatorService.class);

    @BeforeAll
    public static void testStarted() {
        System.out.println("Test is starting...");
        c = new Calculator(service);
    }

    @Test
    public void balloonLettersAreThere() throws IOException {
        solution s = new solution();
        assertTrue(s.maxNumberOfBalloons("BLLOONA") > 0);
        System.out.println("Checking balloon test passed!");
    }

    @Test
    public void lessOrEqualsToZeroThrowsException() {
        ValidateNumber valid = new ValidateNumber();
        assertThrows(InvalidNumberException.class,
                () -> {
                    valid.validateNumber(0);
                });
        System.out.println("Validation test passed!");
    }

    @Test
    public void testCalculator() {

        when(service.add(2, 3)).thenReturn(5);
        assertEquals(10, c.perform(2, 3));
        verify(service).add(2, 3);
        System.out.println("Mocking passed!");
    }

    @AfterAll
    public static void testEnding(){
        System.out.println("Test has ended!");
    }

}