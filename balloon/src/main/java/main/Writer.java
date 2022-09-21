package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public Writer() throws InvalidFileNameException {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));
            writer.write("BLOANSNNADONNLLLNNNOOAASDABB");
            writer.close();
        } catch (IOException e) {
            throw  new InvalidFileNameException("File name dose not exist");
        }

    }
}
