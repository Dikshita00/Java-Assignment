package com.filehandeling;

import java.io.File;
// It holds the given path in variable "f" without chech the file exist
public class FileEx {
	public static void main(String[] args) {
		File f=new File("C:\\FileHandeling\\t1.txt"); //print the file even if it does not exist 
		System.out.println(f);
	}

}
