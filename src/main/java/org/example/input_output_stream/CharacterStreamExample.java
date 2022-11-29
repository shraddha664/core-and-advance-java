package org.example.input_output_stream;

import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("C:\\Users\\HP\\Desktop\\java-tutorials\\source.txt");
            writer = new FileWriter("C:\\Users\\HP\\Desktop\\java-tutorials\\dest.txt");

            //reads a byte at a time,it it reached end of the file return -1
            int content;
            while ((content = reader.read()) != -1) {
                writer.write((char) content);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }


    }
}
