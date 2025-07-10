package com.stringoperation;

public class WordCount {
	public static void main(String[] args) {
		String sentance="Java is fun to learn";
		String[] words=sentance.trim().split("\\s+");
		System.out.println("Word count: "+words.length);
	}

}
