package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import employee.Employee;

public class EmplooyeeOutput{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos=new FileOutputStream("aa.txt",true);
		ObjectOutputStream os=new ObjectOutputStream(fos);
		Employee e6=new Employee(2, 32,"Id");
		os.writeObject(e6);
		FileInputStream fis=new FileInputStream("aa.txt");
		ObjectInputStream is=new ObjectInputStream(fis);
		e6=(Employee) is.readObject();
		System.out.println(e6.getAge());
	}
	
}
