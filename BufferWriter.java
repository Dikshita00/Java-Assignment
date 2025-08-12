package com.filehandeling;

import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 a.	It improves file writing performance
 b.	This should be used with FilerWriter class, If we use only 
 	BufferedWriter then FileWriting cannot be done.
 c. BufferedWriter class has newline() method
 */
public class BufferWriter {
	 public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("C:\\August\\t3.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("mike");
			bw.newLine();
			bw.write(97);
			char[] ch= {'a','b','c','d'};
			bw.newLine();
			bw.write(ch);
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
