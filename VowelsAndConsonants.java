package com.stringoperation;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		String str="HelloWorld";
		int vowels=0,consonants=0;
		str=str.toLowerCase();
		for(char c:str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("aeiou".indexOf(c)!= -1) vowels++;
				else consonants++;
			}
		}
		System.out.println("Vowels : "+ vowels + " Consonents : "+ consonants);
	}

}
