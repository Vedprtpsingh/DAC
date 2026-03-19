package appendandReadString;

import java.io.FileWriter;
import java.io.IOException;

public class StudentAppend {

	public void append1() throws IOException {
		FileWriter fw=new FileWriter("Notes.text",true);
		String note1="Initial Content Written";
		fw.write(note1+"\n");
		fw.close();
	}

}
