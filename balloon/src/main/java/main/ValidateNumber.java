package main;

public class ValidateNumber {

    public void validateNumber(int numb) throws InvalidNumberException {

        if (numb <= 0 ) {
            throw new InvalidNumberException("Invalid number");
        }
    }
}
