package studentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManagementSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/prac";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "cdacacts";

    private Connection conn;
    private Statement stmt;

    public void connect() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        stmt = conn.createStatement();
    }

    public void insertRecord(Scanner scanner) {
        try {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            System.out.print("Enter Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter City: ");
            String city = scanner.nextLine();

            String sql = "INSERT INTO student VALUES (" + id + ", '" + name + "', '" + course + "', " + marks + ", '" + city + "')";
            
            int rowsInserted = stmt.executeUpdate(sql);
            if (rowsInserted > 0) {
                System.out.println("Success: Student record inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting record: " + e.getMessage());
        }
    }

    public void updateRecord(Scanner scanner) {
        try {
            System.out.print("Enter Student ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter New Course: ");
            String course = scanner.nextLine();

            System.out.print("Enter New Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter New City: ");
            String city = scanner.nextLine();

            String sql = "UPDATE student SET student_name='" + name + "', course='" + course + "', marks=" + marks + ", city='" + city + "' WHERE student_id=" + id;
            
            int rowsUpdated = stmt.executeUpdate(sql);
            if (rowsUpdated > 0) {
                System.out.println("Success: Student record updated successfully!");
            } else {
                System.out.println("Warning: No student found with ID " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error updating record: " + e.getMessage());
        }
    }


    public void deleteRecord(Scanner scanner) {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = scanner.nextInt();

            String sql = "DELETE FROM student WHERE student_id = " + id;
            
            int rowsDeleted = stmt.executeUpdate(sql);
            if (rowsDeleted > 0) {
                System.out.println("Success: Student record deleted successfully!");
            } else {
                System.out.println("Warning: No student found with ID " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error deleting record: " + e.getMessage());
        }
    }

    public void displayAllRecords() {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM student";
            rs = stmt.executeQuery(sql);
            printTabularData(rs);
        } catch (SQLException e) {
            System.out.println("Error retrieving records: " + e.getMessage());
        } finally {
            closeResultSet(rs);
        }
    }

    public void searchById(Scanner scanner) {
        ResultSet rs = null;
        try {
            System.out.print("Enter Student ID to search: ");
            int id = scanner.nextInt();

            String sql = "SELECT * FROM student WHERE student_id = " + id;
            rs = stmt.executeQuery(sql);
            printTabularData(rs);
        } catch (SQLException e) {
            System.out.println("Error searching record: " + e.getMessage());
        } finally {
            closeResultSet(rs);
        }
    }


    public void displayByCondition(Scanner scanner) {
        ResultSet rs = null;
        try {
            System.out.print("Enter a cut-off score (displays students with marks greater than this value): ");
            int cutOff = scanner.nextInt();

            String sql = "SELECT * FROM student WHERE marks > " + cutOff;
            rs = stmt.executeQuery(sql);
            printTabularData(rs);
        } catch (SQLException e) {
            System.out.println("Error filtering records: " + e.getMessage());
        } finally {
            closeResultSet(rs);
        }
    }

    private void printTabularData(ResultSet rs) throws SQLException {
    	System.out.println();
        System.out.println("ID - Name - Course - Marks - City");


        boolean hasData = false;
        while (rs.next()) {
            hasData = true;
            System.out.println(rs.getInt("student_id") + " - " +
                    rs.getString("student_name") + " - " +
                    rs.getString("course") + " - " +
                    rs.getInt("marks") + " - " +
                    rs.getString("city"));
        }
        System.out.println();
        if (!hasData) {
            System.out.println("No records found.");
        }
    }

    private void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            System.out.println("Error closing ResultSet: " + e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            System.out.println("Database resources closed successfully.");
        } catch (SQLException e) {
            System.out.println("Error closing database resources: " + e.getMessage());
        }
    }
}
