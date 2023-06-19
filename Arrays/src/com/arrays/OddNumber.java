package com.arrays;

import java.util.Scanner;

// find the odd element from the ARRAY
public class OddNumber {
	
	public void findodd(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[1]%2!= 0) {
				System.out.println(a[i]);	
			}
		}
		System.out.println("ODD NUMBER IS.........");
		
		for(int num:a) {
			if(num%2!=0) {
				System.out.println(num);
			}
		}	
	}
	public static void main(String[] args) {
		int a[] =  new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the NUMBER..............");
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();	
		}
		
		
		OddNumber o = new OddNumber();
		o.findodd(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
































import java.util.Scanner;

public class PrimeNumbersFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers in the array: ");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
