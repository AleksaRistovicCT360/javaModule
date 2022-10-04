package main;

import org.codehaus.plexus.util.FileUtils;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class solution {

    public int maxNumberOfBalloons(String text) throws IOException {

        HashMap<Character,Integer> map = new HashMap<>();

        File folder = new File("C:\\Users\\aristovic\\IdeaProjects\\javaModule\\balloon");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {
                String content = FileUtils.fileRead(file);
                for (int j = 0; j < content.length(); j++) {
                    if (!map.containsKey(content.charAt(j))) {
                        map.put(content.charAt(j), 0);
                    }
                }
                break;
            }
        }

        for(char i:text.toCharArray()){
                if(map.containsKey(i))
                    map.put(i, map.get(i)+1);
        }

        int min1 = Math.min(map.get('L'), map.get('O'));
        int min2 = Math.min(Math.min(map.get('A'), map.get('B')), map.get('N'));

        return Math.min(min1/2, min2);
    }


}
