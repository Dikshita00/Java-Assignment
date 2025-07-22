package com.datatype;

public class DataTypeEx {
	static byte a;
	static int b=10;
	static float c=13.45f;
	static long e=1323577865666878780L;
	static double f=467.46576756d;
	static char g='$';
	static boolean h;
	static String i="String is Class not datatype";
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		// var id java 10 feature store any type of data
		//according to value provided data
		var x1=100;    
		var x2='C';
		var x3="String Value";
		var x4=12.4f;
		var x5=123.5433;//treated as double automatically
		var x6=false;
		var x7=new DataTypeEx();
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		System.out.println(x7);
		
	}
	

}
