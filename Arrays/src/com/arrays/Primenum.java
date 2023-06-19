package com.arrays;

import java.util.Scanner;

public class Primenum {
 

	private static boolean primenumber;

	public static void main(String[] args) {
		System.out.println("Enter a number......");

		Scanner sc =new Scanner(System.in);
		
		int num=sc.nextInt();
		sc.close();
		
		
		boolean prime = primenumber(num);
		
		
		if(primenumber) {
			System.out.println(num+" is prime number ");
			
			
		}
		else {
			System.out.println(num+" iS not prime number");
			
		}
	}

	public static boolean primenumber(int num) {

		if(num<=1){
			
			
		}
		
		return false;
	}

	
	
	
}
