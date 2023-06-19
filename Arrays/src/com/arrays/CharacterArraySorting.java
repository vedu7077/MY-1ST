package com.arrays;
import java.util.Arrays;

public class CharacterArraySorting {
	
	
	
    public static void main(String[] args) {
    	
    	
        char  [] chara = { 'a', 'b', 'c', 'd', 'e' };

        Arrays.sort(chara);
        System.out.println("Ascending Order     : " + Arrays.toString(chara));

        char[] descendingChara = new char[chara.length];
        
        
        
        for (int i = 0; i < chara.length; i++) {
        	
        	
            descendingChara[i] = chara[chara.length - 1 - i];
        }
        System.out.println("Descending Order    : " + Arrays.toString(descendingChara));
    }
}
