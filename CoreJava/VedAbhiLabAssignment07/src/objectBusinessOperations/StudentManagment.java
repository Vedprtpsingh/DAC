package objectBusinessOperations;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

// Main class
public class StudentManagment {

    static final String FILE = "Student.txt";

    // ADD
    public void addStudent() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        File file = new File(FILE);
        FileOutputStream fos = new FileOutputStream(file, true);
        ObjectOutputStream oos;

        if (file.length() == 0) {
            oos = new ObjectOutputStream(fos);
        } else {
            oos = new AppendableObjectOutputStream(fos);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = sc.next();

            System.out.println("Enter marks:");
            double marks = sc.nextDouble();

            Student s = new Student(name, marks);
            oos.writeObject(s);
        }

        oos.close();
        fos.close();
    }

    // DISPLAY
    public void displayStudent() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));

            while (true) {
                Student s = (Student) ois.readObject();
                System.out.println(s);
            }

        } catch (EOFException e) {
            System.out.println("---- End of Records ----");
        }
    }

    // SEARCH
    public void searchStudent() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = sc.nextInt();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));

            while (true) {
                Student s = (Student) ois.readObject();

                if (s.id == id) {
                    System.out.println("Found: " + s);
                    return;
                }
            }

        } catch (EOFException e) {
            System.out.println("Student not found");
        }
    }

    // UPDATE
    public void updateStudent() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to update:");
        int id = sc.nextInt();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.txt"));

        try {
            while (true) {
                Student s = (Student) ois.readObject();

                if (s.id == id) {
                    System.out.println("Enter new name:");
                    s.name = sc.next();

                    System.out.println("Enter new marks:");
                    s.marks = sc.nextDouble();
                }

                oos.writeObject(s);
            }

        } catch (EOFException e) {
            ois.close();
            oos.close();

            new File(FILE).delete();
            new File("temp.txt").renameTo(new File(FILE));

            System.out.println("Student updated");
        }
    }

    // DELETE
    public void deleteStudent() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to delete:");
        int id = sc.nextInt();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.txt"));

        try {
            while (true) {
                Student s = (Student) ois.readObject();

                if (s.id != id) {
                    oos.writeObject(s);
                }
            }

        } catch (EOFException e) {
            ois.close();
            oos.close();

            new File(FILE).delete();
            new File("temp.txt").renameTo(new File(FILE));

            System.out.println("Student deleted");
        }
    }
}