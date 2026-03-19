package appendandReadString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentRead {

	public static void main(String[] args) throws IOException {
		StudentAppend sa1=new StudentAppend();
		StudentAppend2 sa2=new StudentAppend2();
		sa1.append1();
		sa2.append2();
		FileReader fr=new FileReader("Notes.text");
		BufferedReader br=new BufferedReader(fr);
		String str1=br.readLine();
		String str2=br.readLine();
		System.out.println(str1+"\n"+str2);
		fr.close();
		br.close();
	}

}
