package iopractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NormalStringRead {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("abc.text");
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		fr.close();
	}
}
