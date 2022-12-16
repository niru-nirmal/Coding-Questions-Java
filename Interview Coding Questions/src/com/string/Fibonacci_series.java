package com.string;

public class Fibonacci_series {
	
	public static void fiboSeries(int n) {
		int a =0;
		int b =1;
		int c=0;
		System.out.println(a);
		for(int i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		
		
		
		}
	public static void main(String[] args) {
		Fibonacci_series.fiboSeries(10);
		
	}
}
