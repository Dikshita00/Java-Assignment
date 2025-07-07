package com.controlstatment;
//Count Vowels in a String using loop
public class VowelsCount {
	public static void main(String[] args) {
		String str="Interview";
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if("aeiou".indexOf(ch)!= -1)
				count++;
		}
		System.out.println("Vowel Count: "+ count);
	}

}
