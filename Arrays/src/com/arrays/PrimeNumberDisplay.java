package com.arrays;




public class PrimeNumberDisplay {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        System.out.println("Prime numbers in the array are:");
        for (int num : numbers) {
            if (isPrime(num)) {
            	
            	
            	
                System.out.print(num + " ");
            }
        }
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
