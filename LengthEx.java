package com.filehandeling;

import java.io.File;

/*
 	It is a non static method present inside File class
 	Return type of this method is long
 	It counts characters with white space in the given file
 */
public class LengthEx {
	public static void main(String[] args) {
		File f=new File("C:\\August\\t3.txt");
		long val = f.length();
		System.out.println(val);
		
	}

}
