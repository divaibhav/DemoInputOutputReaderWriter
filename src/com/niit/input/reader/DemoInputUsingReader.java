package com.niit.input.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoInputUsingReader {
    public static void readFile(String fileName){
        FileReader fileReader;

        File file;

        file = new File(fileName);
        try {
            fileReader = new FileReader(file);
            int read = 0;
            while ((read = fileReader.read()) != -1){
                System.out.print((char)read);
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "resources/xyz.txt";
        readFile(fileName);
    }
}
