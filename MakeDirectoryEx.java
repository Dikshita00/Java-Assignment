package com.filehandeling;

import java.io.File;

/*
  # mkdir
  It is a non static method present inside File class
  Return type of this method is boolean
  It creates folder in the given path
  if folder is created, it will return true or else false
  It will not replace existing folder
 */
public class MakeDirectoryEx {
	public static void main(String[] args) {
		File f=new File("C:\\August\\t1.txt");
		boolean val = f.mkdir();
		System.out.println(val);
	}

}
