package fileClassOperations;
import java.io.File;
import java.io.IOException;

public class FileOperationsDemo {
    public static void main(String[] args) {

        try {
            File dir = new File("MyFiles");
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("Directory created: " + dir.getName());
            } else {
                System.out.println("Directory already exists.");
            }

            File file = new File(dir, "test.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            File newFile = new File(dir, "newtest.txt");
            if (file.renameTo(newFile)) {
                System.out.println("File renamed to: " + newFile.getName());
            } else {
                System.out.println("Rename failed.");
            }

            System.out.println("\nFiles in directory:");
            File[] filesList = dir.listFiles();

            for (File f : filesList) {
                System.out.println("-------------------------");
                
                System.out.println("File Name: " + f.getName());
                System.out.println("File Path: " + f.getAbsolutePath());
                System.out.println("File Size: " + f.length() + " bytes");
                System.out.println("Readable: " + f.canRead());
                System.out.println("Writable: " + f.canWrite());
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}