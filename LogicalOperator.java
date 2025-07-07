package com.operator;

public class LogicalOperator {
	public static void main(String[] args) {
		int a=10,b=20,c=10;
		System.out.println(a<20 && a!=c);
		System.out.println(a==20 || a==c);
		System.out.println(a>b || a<b);
		System.out.println(a==c && b>c);
	}

}
