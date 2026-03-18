package iopractice;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectRead {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee) ois.readObject();
		Employee e2=(Employee) ois.readObject();
		Employee e3=(Employee) ois.readObject();
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
		fis.close();
		ois.close();
	}
}
