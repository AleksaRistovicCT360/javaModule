package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solutionTest {

    @Test
    void balloonLettersAreThere() {
        var s = new solution();
        assertTrue(s.maxNumberOfBalloons("BLLOONA") > 0);
    }

}