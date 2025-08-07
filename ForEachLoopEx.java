package com.loop;
/*
   for each loop - 
-> Works only with data structure
-> Can only read value of data structure one by one
-> Loop will run until all values reading is not completed in the 
   given data structure
 */
public class ForEachLoopEx {
	public static void main(String[] args) {
		int[] age=new int[3];
		age[0]=100;
		age[1]=200;
		age[2]=300;
		
		for(int x:age) {
			System.out.println(x);
		}
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
	}

}
