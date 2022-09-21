package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main {

    static String fileName;

    private static void validateNumber(int numb) throws InvalidNumberException {

        if (numb <= 0 ) {
            throw new InvalidNumberException("Invalid number");
        }
    }

    public static void main(String[] args) throws InvalidNumberException, IOException, InvalidFileNameException {

        Writer writer = new Writer();
        BufferedReader reader = new BufferedReader(new FileReader("result.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("result.txt"));

        solution s = new solution();
        validateNumber(s.maxNumberOfBalloons(reader.readLine()));
        System.out.println(s.maxNumberOfBalloons(reader2.readLine()));
        reader.close();
        reader2.close();

        fileName = "c:\\Java\\Hello.txt";

        try{
            File f = new File(fileName);
            f.createNewFile();
            System.out.println("Created file Hello.txt");
        }
        catch (NullPointerException | IOException | SecurityException e) {
            System.out.println("Unable to create Hello.txt ... " + e);
        }

    }

}
