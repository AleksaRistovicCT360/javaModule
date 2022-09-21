package main;

public class InvalidFileNameException extends Exception{

    public InvalidFileNameException(String message) {
        super("This is invalid file name exception : " + message);
    }
}
