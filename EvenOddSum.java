package com.controlstatment;

public class EvenOddSum {
	public static void main(String[] args) {
		int  num=1234;
		int evensum=0,oddsum=0;
		while(num!=0) {
			int digit=num%10;
			if(digit%2==0)
				evensum += digit;
			else
				oddsum += digit;
			num /=10;
		}
		System.out.println("Even Sum: "+ evensum);
		System.out.println("Odd Sum: "+ oddsum);
	}

}
