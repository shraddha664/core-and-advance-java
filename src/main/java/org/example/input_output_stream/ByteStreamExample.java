package org.example.input_output_stream;

import java.io.*;

public class ByteStreamExample {

    public static void main(String[] args) throws IOException {

       FileInputStream inStream=null;
        FileOutputStream outStream=null;

        try{
            inStream=new FileInputStream("C:\\Users\\HP\\Desktop\\java-tutorials\\source.txt");
            outStream=new FileOutputStream("C:\\Users\\HP\\Desktop\\java-tutorials\\dest.txt");

            //reads a byte at a time,it it reached end of the file return -1
        int content;
        while((content=inStream.read())!=-1){
            outStream.write((byte)content );

        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(inStream!=null){
                inStream.close();
            }
            if (outStream!=null){
                outStream.close();
            }
        }




    }
}