package com.arrays;

import java.util.Arrays;

public class Logic {
	
	
	
	public void changechar(char ch[]) {
		
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[1]>='A'  && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);	
			}
			else if(ch[i]>='a'  && ch[i]<='z') {
				ch[i]=(char) (ch[i]-32);
			}
			else {
				ch[i]=ch[i];
			}
			
			System.out.println(Arrays.toString(ch));
			
			Logic a = new Logic();
			a.changechar(ch);
		}}
	public static void main(String[] args) {
		char[] ch= {'t','l','a','d','n'};
		System.out.println(Arrays.toString(ch));
		
		
		
		
		
		

	}

}
