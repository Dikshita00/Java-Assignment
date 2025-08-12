package com.filehandeling;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 	BufferReader
 a. This will improve file reading performance
 b. This should be use with FileReader class, if we use only 
 	BufferReader then FileReaing cannot be done.
 c. It has readLine() method. Using this method we can read the 
 	entire line from the file.
 
 */
public class BufferReader {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("C:\\August\\t3.txt");
			BufferedReader br=new BufferedReader(fr);
			
			System.out.println((char)br.read());
			br.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
