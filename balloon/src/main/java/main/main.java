package main;

import java.io.*;

public class main {

    static String fileName;



    public static void main(String[] args) throws InvalidNumberException, IOException, InvalidFileNameException {

        BufferedReader reader = new BufferedReader(new FileReader("result.txt"));
        ValidateNumber validateNumber = new ValidateNumber();

        solution s = new solution();
        validateNumber.validateNumber(s.maxNumberOfBalloons(reader.readLine()));
        reader.close();

        BufferedReader reader2 = new BufferedReader(new FileReader("result.txt"));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("result2.txt"));
        int result = s.maxNumberOfBalloons(reader2.readLine());
        System.out.println(result);
        writer2.write(String.valueOf(result));
        writer2.close();
        reader2.close();

        fileName = "result3.txt";

        try{
            File f = new File(fileName);
            f.createNewFile();
            System.out.println("Created file result3.txt");
        }
        catch (NullPointerException | IOException | SecurityException e) {
            System.out.println(e.getClass().getCanonicalName());
            throw new InvalidFileNameException("Didnt created file");
        }

    }

}
