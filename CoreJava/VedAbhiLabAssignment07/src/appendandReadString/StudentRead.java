package appendandReadString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentRead {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Notes.text");
		BufferedReader br=new BufferedReader(fr);
		String str1=br.readLine();
		String str2=br.readLine();
		System.out.println(str1+"\n"+str2);
		fr.close();
		br.close();
	}

}
