package com.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class vedant {
	
	
public static void main(String[] args) {
	
	
	LinkedList<String> ls= new LinkedList<> ();
	ls.add("java");
	ls.add("C++");
	ls.add("paython");
	ls.add("c");
	ls.add("java");
	System.out.println(ls);
	
	ls.removeFirst();
	System.out.println(ls);
	ls.offer("SQL");
	System.out.println(ls);
	ls.offerFirst(".Net");
	System.out.println(ls);
	
	ArrayList <String> al=new ArrayList<String>(ls);
	System.out.println(al);
	

}

}