package com.xworkz.RND.Assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\admin\\eclipse-workspace\\RND\\src\\com\\xworkz\\RND\\Assignment\\TxtFile.java";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line of the file to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
            }
    }
}


