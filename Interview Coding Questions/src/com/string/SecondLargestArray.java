package com.string;

public class SecondLargestArray {
	public static void main(String[] args) {
		int arr[] = { 34, 10, 76, 54 };
        for(int i=0;i<arr.length-1;i++) {
        	int temp;
        	if(arr[i]>arr[i+1]) {
        		temp=arr[i];
        		arr[i]=arr[i+1];
        		arr[i+1]=temp;
	}
        }
}
}