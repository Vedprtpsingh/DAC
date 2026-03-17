package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import employee.Employee;

public class empInput {
	void inputData() throws IOException, ClassNotFoundException{
		FileInputStream fis=new FileInputStream("aa.txt");
		ObjectInputStream os=new ObjectInputStream(fis);
		Employee e6=(Employee) os.readObject();
		System.out.println(e6.getAge());
	}
}
