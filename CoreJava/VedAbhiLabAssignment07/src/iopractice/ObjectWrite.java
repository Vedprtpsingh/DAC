package iopractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fos);
		Employee e1=new Employee(101, "Abhi");
		Employee e2=new Employee(102, "Ved");
		Employee e3=new Employee(103, "Shivam");
		ois.writeObject(e1);
		ois.writeObject(e2);
		ois.writeObject(e3);
		fos.close();
		ois.close();
	}
}
