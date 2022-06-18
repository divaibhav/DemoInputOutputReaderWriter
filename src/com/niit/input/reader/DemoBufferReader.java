package com.niit.input.reader;

import java.io.*;

public class DemoBufferReader {
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader  =
                new BufferedReader(fileReader);
        String line = "";
        int count = 0;
        int countWordInEachLine = 0;
        while ((line = bufferedReader.readLine()) != null){

          /*  // I want to count number of words in each line
            // to do so, I have to process  the line
            countWordInEachLine += countWords(line);
            count++;//number of lines
            System.out.println("countWordInEachLine = " + countWordInEachLine);*/
            System.out.println(line);
        }
        System.out.println("number of lines  = " + count);

    }

    private static int countWords(String line) {

        return line.split(" ").length;
    }

    public static void main(String[] args) {
        String fileName = "resources/xyz.txt";
        try {
            readFile(fileName);
        }
        catch (IOException e){
            System.out.println("e.getClass() = " + e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
