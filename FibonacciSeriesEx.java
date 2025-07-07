package com.controlstatment;

public class FibonacciSeriesEx {
	public static void main(String[] args) {
		int n=10,a=0,b=1;
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
