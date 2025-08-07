package com.loop;

public class ContinueEx {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			if(i==2) {
				continue; //continue keyword will take you back to for loop
			}
			System.out.println(i);
		}
	}

}
