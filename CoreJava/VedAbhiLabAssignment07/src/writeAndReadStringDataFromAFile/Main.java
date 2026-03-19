package writeAndReadStringDataFromAFile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("Student.text");
		String[] stu= {"Ram","John","Meena","Kiran","David"};
		fw.write(stu[0]+"\n");
		fw.write(stu[1]+"\n");
		fw.write(stu[2]+"\n");
		fw.write(stu[3]+"\n");
		fw.write(stu[4]+"\n");
		fw.close();
		
		
		
		ReadMain rm=new ReadMain();
		rm.readFile();
	}

}
