package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateNumberTest {

    @Test
    void lessOrEqualsToZeroThrowsException() {
        var valid = new ValidateNumber();
        assertThrows(InvalidNumberException.class,
                () -> {
                    valid.validateNumber(0);
                });
    }

}