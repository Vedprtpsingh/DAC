package studentManagement;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        try {
            sms.connect();

            int choice;
            do {
            	System.out.println();
                System.out.println("1. Insert Student Record");
                System.out.println("2. Update Student Record");
                System.out.println("3. Delete Student Record");
                System.out.println("4. Display All Student Records");
                System.out.println("5. Search Student by ID");
                System.out.println("6. Display Students Based on marks cut-off");
                System.out.println("7. Exit");
                System.out.print("Enter your Choice: ");
                
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        sms.insertRecord(scanner);
                        break;
                    case 2:
                        sms.updateRecord(scanner);
                        break;
                    case 3:
                        sms.deleteRecord(scanner);
                        break;
                    case 4:
                        sms.displayAllRecords();
                        break;
                    case 5:
                        sms.searchById(scanner);
                        break;
                    case 6:
                        sms.displayByCondition(scanner);
                        break;
                    case 7:
                        System.out.println("Exiting the application gracefully. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please select a valid option (1-7).");
                }
            } while (choice != 7);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sms.disconnect();
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
