package com.string;

public class VowelsAndConstonants {
	
	
	
	public static void isVowel(String str) {
		int cons =0;
		int vowel=0;
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
					|| str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel++;
			
		}else {
			cons++;
		}
	
		}
		System.out.println("Total vowels are " + vowel);
		System.out.println("Total constonants are" + cons);
		
	}
	public static void main(String[] args) {
		isVowel("My name is nirmal");
	}

}
