package com.filehandeling;

import java.io.File;

/*
  It is a non static method present inside File class
  Return type of this method is boolean
  It check whether the file exist in the given path
  If file exists, it will return true or false
 */
public class ExistEx {
	public static void main(String[] args) {
		File f=new File("C:\\\\August\\\\t1.txt");
		boolean val = f.exists();
		System.out.println(val);
	}

}
