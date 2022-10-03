package main;

import java.io.*;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

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

        File directory = new File("C:\\Users\\aristovic\\IdeaProjects\\javaModule\\balloon");
        File[] fi = directory.listFiles();
        int fileCount = 0;
        int files = 0;

        Executor executor = Executors.newCachedThreadPool();

        for (int i = 0; i<fi.length; i++) {

            if (fi[i].getName().endsWith(".txt")) {
                fileCount++;
                int finalFiles = files++;
                executor.execute(() -> System.out.println("File " + finalFiles));
            }
        }

        System.out.println("File Count: " + fileCount);

    }
}
