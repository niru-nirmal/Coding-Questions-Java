package com.string;

public class DupicateInArray {
public static void main(String[] args) {
	
	
		int arr[] = {34,65,87,5,78,54,87,65};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
