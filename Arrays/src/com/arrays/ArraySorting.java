package com.arrays;
import java.util.Arrays;

public class ArraySorting {
	
	
	
    public static void main(String[] args) {
        int[] num = { 2, 3, 4, 5, 6 };

        //  ascending order..........................
        
        Arrays.sort(num);
        System.out.println("Ascending Order   : " + Arrays.toString(num));

        // descending order..............................................
        
        
        int[] descendingNum = new int[num.length];
        
        for (int i = 0; i < num.length; i++) {
            descendingNum[i] = num[num.length - 1 - i];
        }
        System.out.println("Descending Order   : " + Arrays.toString(descendingNum));
    }
}
