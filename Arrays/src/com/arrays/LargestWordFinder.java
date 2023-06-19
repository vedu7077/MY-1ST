package com.arrays;



public class LargestWordFinder {
	
	
	
    public static void main(String[] args) {
    	
    	
        String  [] arr = {"india", "is", "Beautiful", "country"};
        
        
        
        String largestWord = findLargestWord(arr);
        
        
        
        
        System.out.println("The largest word is: " + largestWord);
    }

    public static String findLargestWord(String[] arr) {
        String largestWord = "";
        for (String word : arr) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        return largestWord;
    }
}

 