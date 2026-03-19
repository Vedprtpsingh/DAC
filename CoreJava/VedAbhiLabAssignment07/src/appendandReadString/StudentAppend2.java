package appendandReadString;

import java.io.FileWriter;
import java.io.IOException;

public class StudentAppend2 {

	public void append2() throws IOException {
		FileWriter fw=new FileWriter("Notes.text",true);
		String note1="Appending New Content";
		fw.write(note1+"\n");
		fw.close();
	}

}
