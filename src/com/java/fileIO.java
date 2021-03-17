package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileIO {
    public static void main(String[] args) throws IOException {
        //input
        File file = new File("\\C:\\hello\\text.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        //output
        FileWriter writer = new FileWriter("\\C:\\hello\\new.txt");
        writer.write("hello this is the new file created from java");
        writer.close();
    }
}
