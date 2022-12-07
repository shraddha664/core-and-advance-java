package org.example.abstract_demo;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        new NumberExtractReport().prepareAndSendReport("src/main/java/org.example/data.txt");
    }
}
