package com.filehandeling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// to create a file in system
public class MainSerializationEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("C:\\\\August\\\\file.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			SerializationEx s=new SerializationEx();
			oos.writeObject(s);
			oos.close();
			fos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}

}
