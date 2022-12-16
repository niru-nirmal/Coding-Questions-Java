package com.string;

public class DigitOccurance {

	public static void occuranceDigit(int n, int d) {

		int rem;
		int counter = 0;

		while (n != 0) {
			rem = n % 10;
			n = n/10;
			if (rem == d) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static void main(String[] args) {
		int n = 23456344;
		int d = 4;
		occuranceDigit(n, d);
	}
}
