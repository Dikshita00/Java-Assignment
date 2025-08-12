package com.filehandeling;

import java.io.File;

/*
 	# Delete file handling method
 	It is a non static method present inside File class
 	Return type of this method is boolean
 	It deletes the file exists in the given path
 	If the file is deleted it will return true of false
 	
 	NOTE: delete() can delete both folder and file
 */
public class DeleteEx {
	public static void main(String[] args) {
		File f=new File("C:\\August\\t1.txt");
		boolean val = f.delete();
		System.out.println(val);
	}

}
