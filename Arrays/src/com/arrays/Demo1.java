


package com.arrays;

import java.util.Scanner;

//Find the even element from the array
public class Demo1 {
	
	public void findeven(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[1]%2==0) {		
				System.out.println(a[i]);		
			}
		}
		
		
	System.out.println("..................");
	
	for(int num:a) {
		if(num%2==0) {
			System.out.println(num);
		}
	}
		
		
		
	}
	public static void main(String[] args) {
		int a[]=new int [5];
	Scanner sc = new Scanner(System.in);
	
	System.out.println( " Enter the Element");
	for(int i =0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("...............................");	
	Demo1 d1=new Demo1();
	d1.findeven(a);
	
	
	
	
	
	
	

	}

}
