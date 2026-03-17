package test;

import java.io.*;

public class AppendFileExample {

    public static void main(String[] args) {

        String fileName = "notes.txt";

        try {

            // Step 1: Write initial content
            FileWriter fw = new FileWriter(fileName);
            fw.write("Initial Content Written\n");
            fw.close();

            System.out.println("Initial Content Written");

            // Step 2: Append new content
            FileWriter fwAppend = new FileWriter(fileName, true); // true = append mode
            fwAppend.write("This is additional content added later\n");
            fwAppend.close();

            System.out.println("\nAppending new content...");

            // Step 3: Read and display file content
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\nFinal File Content:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}