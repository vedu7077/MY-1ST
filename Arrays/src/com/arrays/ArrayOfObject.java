package com.arrays;

import java.util.Scanner;

class Stud{
	
	int id;
	String name;
	
	
	Stud(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	
	public String toString() {
		return id +"  "+name;
		
	}
}

class Course{
	int cid;
	String cname;
	Student stud;	
	public Course(int cid,String cname,Stud stud2) {
		this.cid=cid;
		this.cname=cname;
		
	}
	
	public String toString() {
		return cid+" "+ cname+" "+ stud;
		
	}
}
public class ArrayOfObject {

	public static void main(String[] args) {
		
		Course c[] = new Course[3];
Scanner sc = new Scanner(System.in);
System.out.println("Enter details");
for(int i=0;i<c.length;i++) {
	
	System.out.println("Enter the course id ");
	int cid = sc.nextInt();
	
	System.out.println("Enter the course name");
	String cname=sc.next();
	
	System.out.println("Enter the Stud Id ");
	int sid=sc.nextInt();
	
	
	System.out.println("Enter the stud name");
	String sname = sc.next();
	
	
	Stud s = new Stud(sid, cname);
	c[i]= new Course(cid,cname,new Stud(sid,sname));
	
	
	
	System.out.println("      ");
	
	for(int j =0;j<c.length;j++) {
		System.out.println(c[j]);
		
		
	}
	
	
	
	
	
	
	
	
	
	


}
	}

}
