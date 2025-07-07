package com.controlstatment;

public class PrimeNumber {
	public static void main(String[] args) {
		int num =8, count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count=count+1;
			
			}
			if(count>0) {
				System.out.println("Not Prime");
			}else {
				System.out.println("Prime Number");
			}
		}
	}

}
