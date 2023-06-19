package com.arrays;

import java.util.Scanner;

public class AlternateElements {

	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      
      
      System.out.print("Enter the size of array.....");
      int size = sc.nextInt();
      
      int[]array= new int[size];
      
      System.out.println("Enter the element of array");
      
      
      for(int i=0; i<size;i++) {
    	  
    	  array[i]=sc.nextInt();
    	  
      }
      
      
      System.err.println("Alternate number of array");
      
      for(int i=0;i<size;i+=2) {
    	  System.out.println(array[i]);
      }
    	  
      }
		
		
	}


