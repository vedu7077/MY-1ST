package com.arrays;

public class Replaceeven {

	public static void main(String[] args) {
       
		int [] arr= {3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[i]=1;
			}   
			System.out.println(arr[i]);
		}
		
			
	}

}
