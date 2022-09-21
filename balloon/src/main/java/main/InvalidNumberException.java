package main;

public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(){}

    public InvalidNumberException(String message) {
        super("This is invalid number exception : " + message);
    }

    public InvalidNumberException(Throwable cause) {
        super(cause);
    }

}
