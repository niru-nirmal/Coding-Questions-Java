package com.string;

import java.util.LinkedHashSet;

public class UniqueChar {

public static void main(String[] args) {
LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
		
		String str = "nirmalas";
		for(int i=0; i<str.length();i++) {
			lhs.add(str.charAt(i));
			
		}
		
		for(Character c :lhs) {
			System.out.println(c);
		
		
	}
}
}
