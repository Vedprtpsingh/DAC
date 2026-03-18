package iopractice;
import java.io.*;
import java.util.Scanner;
public class NormalStringWrite {
	public static void main(String[] args) throws IOException{
		FileWriter fw =new FileWriter("abc.text");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		fw.write(str);
		fw.close();
	}
}
