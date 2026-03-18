package writeAndReadStringDataFromAFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMain {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Student.text");
		BufferedReader br=new BufferedReader(fr);
		String[] stu=new String[5];
		for(int i=0;i<stu.length;i++) {
			stu[i]=br.readLine();
			System.out.println(stu[i]);
		}
		fr.close();
		br.close();
		
	}

}
