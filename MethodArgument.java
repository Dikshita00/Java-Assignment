package com.variables;

public class MethodArgument {
	
	public void test(int x,String y) { //local argument
		System.out.println(x);
		System.out.println(y);
	}
	public void implement(Object z) {// Object let us supply any type of value
		System.out.println(z);
	}
	public void display(int...A) {// int...x any number of value that we supply will capture in x
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);

	}
	public void multipleDataType(String c,int...b) {//if we use multiple datatype then int...x always suppose to be last otherwise it will give error
		 System.out.println(c);
		 System.out.println(b[0]);
	}
	public void test2(Object...d) {
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);

	}
	public static void main(String[] args) {
		MethodArgument obj=new MethodArgument();
		obj.test(100,"Dikshita");
		obj.implement(1.34);
		obj.display(1,2,3,4,6,87,6);
		obj.multipleDataType("Roll no.",17,2,3,35);
		obj.test2("Alphabate",'A',"Roll no.",1);
	}
	

}
