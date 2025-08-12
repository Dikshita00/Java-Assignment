package com.filehandeling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainDesrializationEx  {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\August\\file.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MainDesrializationEx md=(MainDesrializationEx)ois.readObject();
			System.out.println(md.name);
			System.out.println(md.password);
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
