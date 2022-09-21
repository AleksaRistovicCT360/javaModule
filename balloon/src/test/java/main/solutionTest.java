package main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solutionTest {

    @BeforeAll
    public static void testStarted() {
        System.out.println("Test is starting...");
    }

    @Test
    void balloonLettersAreThere() {
        solution s = new solution();
        assertTrue(s.maxNumberOfBalloons("BLLOONA") > 0);
        System.out.println("Checking balloon test passed!");
    }

    @Test
    void lessOrEqualsToZeroThrowsException() {
        ValidateNumber valid = new ValidateNumber();
        assertThrows(InvalidNumberException.class,
                () -> {
                    valid.validateNumber(0);
                });
        System.out.println("Validation test passed!");
    }

    @AfterAll
    public static void testEnding(){
        System.out.println("Test has ended!");
    }

}