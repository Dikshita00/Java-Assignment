package com.loop;
/*
 do while loop -  Will run first time without condition check. 
 For second iteration condition will be evaluated
 */
public class DoWhileLoopEx {
	public static void main(String[] args) {
		int i=100;
		do {
			System.out.println(i);
			i++;
		}while(i<3);
	}

}
