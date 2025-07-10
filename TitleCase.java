package com.stringoperation;

public class TitleCase {
	public static void main(String[] args) {
		String str="Hello Java World";
		String[] words=str.split("");
		StringBuilder title=new StringBuilder();
		for(String word: words) {
			title.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			
		}
		System.out.println("Title Case: "+title.toString().trim());
	}

}
