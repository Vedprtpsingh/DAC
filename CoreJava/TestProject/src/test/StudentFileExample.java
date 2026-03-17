package test;
import java.io.*;
import java.util.Scanner;

public class StudentFileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "students.txt";

        try {
            // Writing data to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            System.out.println("Enter student names:");

            for (int i = 0; i < 5; i++) {
                String name = sc.nextLine();
                bw.write(name);
                bw.newLine();   // move to next line in file
            }

            bw.close();

            // Reading data from file
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            System.out.println("\nReading from file:");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}