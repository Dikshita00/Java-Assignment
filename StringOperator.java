package com.stringoperation;

public class StringOperator {
	
	public static void main(String[] args) {
		String str1="jurassic ";
		String str2="park";
		System.out.println("Length to str1 :"+str1.length()); //length()
		
		System.out.println("Character at index 1 in str :"+str1.charAt(1));//charAt()
		
		System.out.println("Substring of str1(1 to 4) :"+str1.substring(1,4));//substring()
		
		System.out.println("Concitenation :"+ str1.concat(str2));//concat()
		
		System.out.println("str1 compare to str2 :"+ str1.compareTo(str2));//compare()
		
		System.out.println("str1 in lower case :"+str1.toLowerCase());//toLowerCase()
		
		System.out.println("str2 in upper case :"+str2.toUpperCase());//toUpperCase()
		
		String str3="Java Programming";
		
		System.out.println("Trimmed string: "+str3.trim()+"'");//trim()
		
		System.out.println("Contains 'Java': "+str3.contains("Java"));//contains()
		
		System.out.println("Index of 'o' in str3"+ str3.indexOf('a'));//indexOf()
		
		System.out.println("Replace 'a' with 'x' in str3"+ str3.replace('a', 'x') );//replace()
		
		//split()
		String[] words=str3.trim().split(" ");
		System.out.println("Words in str3: ");
		for(String word : words) {
			System.out.println(word);
		}
		
		//isEmpty()
		String emptyStr="";
		System.out.println("Is emptyStr empty?"+ emptyStr.isEmpty());
		
		//startsWith()
		System.out.println("str1 starts with 'He' :"+str1.startsWith("He"));
		
		//endsWith()
		System.out.println("str2 ends with 'id' :"+str2.endsWith("Id"));
		
		//valueOf()
		int num=100;
		String strNum=String.valueOf(num);
		System.out.println("Sttring value of number :"+strNum);
		
		//join()
		String joined=String.join("-", "Java","is","fun");
		System.out.println("Joined string :"+joined);
		
	}

}
