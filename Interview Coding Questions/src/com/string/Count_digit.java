package com.string;

public class Count_digit {
	
	
static int count;
static int digit;
	public static void digitCount(int num) {
		
		if(num==0) {
			System.out.println(1);
		}else {
		while(num!=0) {
			digit=num%10;
			num = num/10;
			count++;
		}
		System.out.println(count);
	}
	}
	public static void main(String[] args) {
		
		int number = 0;
		digitCount(number);
	}
}
