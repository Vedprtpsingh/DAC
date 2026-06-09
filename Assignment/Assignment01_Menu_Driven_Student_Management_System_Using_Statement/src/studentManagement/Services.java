package studentManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Services {

	static Scanner sc = new Scanner(System.in);
	public static void insertStudentRecord(Statement smt) throws SQLException {
        System.out.print("Enter Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();
        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student City: ");
        String city = sc.nextLine();
        String q = "INSERT INTO Student VALUES (" +
                   sid + ", '" +
                   sname + "', '" +
                   course + "', " +
                   marks + ", '" +
                   city + "')";
        int n = smt.executeUpdate(q);
        System.out.println("Total "+n+" Rows Effected");
		
	}

	public static void updateStudentRecord(Statement smt) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter The Student ID:");
		int id=sc.nextInt();
		
        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();
        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student City: ");
        String city = sc.nextLine();
        
        String q = "UPDATE Student SET " +
                "sname='" + sname + "', " +
                "course='" + course + "', " +
                "marks=" + marks + ", " +
                "city='" + city + "' " +
                "WHERE sid=" + id;
        int n = smt.executeUpdate(q);
        System.out.println("Total "+n+" Rows Effected");
		
	}

	public static void deleteStudentRecord(Statement smt) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter The Student ID:");
		int id=sc.nextInt();
		
		
        String q = "Delete from Student where sid="+id;
        int n = smt.executeUpdate(q);
        System.out.println("Total "+n+" Rows Effected");
		
	}

	public static void displayAllStudentRecords(Statement smt) throws SQLException {
		// TODO Auto-generated method stub
		
		
        String q = "select * from student";
        ResultSet rs = smt.executeQuery(q);
        while(rs.next()) {
        	System.out.println("Student ID: "+rs.getInt(1)+" Student Name: "+ rs.getString(2)+" Student Course: "+rs.getString(3)+ " Student Marks: "+rs.getString(4)+ " Student City: "+rs.getString(5));
        }
		
	}

	public static void searchStudentbyID(Statement smt) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter The Student ID:");
		int id=sc.nextInt();
		
		
        String q = "select * from student where id="+id;
        ResultSet rs = smt.executeQuery(q);
        	System.out.println("Student ID: "+rs.getInt(1)+" Student Name: "+ rs.getString(2)+" Student Course: "+rs.getString(3)+ " Student Marks: "+rs.getString(4)+ " Student City: "+rs.getString(5));
		
	}

	public static void displayStudentsBasedonCondition(Statement smt) throws SQLException {
//		1. Sort By Name
//		2. Sort By Marks
//		3. Sort By Course
//		4. Sort By City
//		5. Get Where Marks is Greater Than
//		6. Get Where Marks is Less Than
//		7. Search By Name
//		8. Search By City Name
//		9. Search By Course Name
//		10. Search By Marks Name
//		0. Exit
		while(true) {
			String q;
			ResultSet rs;
			String input;
		System.out.println("1. Sort By Name\r\n" + 
				"2. Sort By Marks\r\n" + 
				"3. Sort By Course\r\n" + 
				"4. Sort By City\r\n" + 
				"5. Get Where Marks is Greater Than\r\n" + 
				"6. Get Where Marks is Less Than\r\n" + 
				"7. Search By Name\r\n" + 
				"8. Search By City Name\r\n" + 
				"9. Search By Course Name\r\n" + 
				"10. Search By Marks Name\r\n" + 
				"0. Exit");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
	        q = "select * from student order by sname";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student Name: "+ rs.getString(2));
	        }
		break;
		
		case 2:
	        q = "select * from student order by marks";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student Marks: "+rs.getString(4));
	        }
		break;
		
		
		case 3:
	        q = "select * from student order by course";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student Course: "+rs.getString(3));
	        }
		break;
		
		
		case 4:
	        q = "select * from student order by city";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student City: "+rs.getString(5));
	        }
		break;
		
		
		case 5:
			System.out.println("Enter the Marks: ");
			input=sc.next();
	        q = "select * from student where marks >"+input;
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+ " Student Marks: "+rs.getString(4));
	        }
	        
	        
		break;
		
		
		
		case 6:
			
			System.out.println("Enter the Marks: ");
			input=sc.next();
	        q = "select * from student where marks <"+input;
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+ " Student Marks: "+rs.getString(4));
	        }
		break;
		
		
		
		case 7:
			
			System.out.println("Enter the Name: ");
			input=sc.next();
	        q = "select * from student where name ="+"'"+input+"'";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student Name: "+ rs.getString(2));
	        }
		break;
		
		case 8:
			
			System.out.println("Enter the City: ");
			input=sc.next();
	        q = "select * from student where city ="+"'"+input+"'";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student City: "+rs.getString(5));
	        }
		break;
		
		case 9:
			
			System.out.println("Enter the Course: ");
			input=sc.next();
	        q = "select * from student where course ="+"'"+input+"'";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student Course: "+rs.getString(3));
	        }
		break;
		
		case 10:
			
			System.out.println("Enter the Marks: ");
			input=sc.next();
	        q = "select * from student where Marks ="+"'"+input+"'";
	        rs = smt.executeQuery(q);
	        while(rs.next()) {
	        	System.out.println("Student ID: "+rs.getInt(1)+" Student Marks: "+rs.getString(4));
	        }
		break;
		case 0:
			System.out.println("Thank You!");
			System.exit(0);
		break;
		
		default:
			System.out.println("Enter A Valid Number: ");
		 }
		}
	}
	
}
