package test;

import java.io.*;
import java.util.Scanner;

public class StudentRecordSystem {

    static final String FILE_NAME = "students.dat";

    // Add Student Record
    public static void addStudent(Student s) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Display All Students
    public static void displayStudents() {
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("ID\tName\tMarks");

            while (true) {
                Student s = (Student) ois.readObject();
                System.out.println(s.id + "\t" + s.name + "\t" + s.marks);
            }

        } catch (EOFException e) {
            // End of file reached
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept 3 students
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            Student s = new Student(id, name, marks);
            addStudent(s);
        }

        System.out.println("\nStudent Records\n");
        displayStudents();

        sc.close();
    }
}