package com.arrays2;

import java.util.Arrays;
import java.util.Scanner;

class Movie{
	int mid;
	String mname;
	String [] actorname;
	
	
	
	Movie(int mid,String mname,String[]actorname){
		this.mid=mid;
		this.mname=mname;
		this.actorname=actorname;	
	}
	public String toString() {
		
		return mid+"  "+ mname+" "+Arrays.toString(actorname);
	}} 

public class ArrayofObject {

	public static void main(String[] args) {
		
		
		Movie m[]=new Movie[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < m.length;i++) {
			System.out.println("Enter the movie ID....");
			int mid=sc.nextInt();
			
			System.out.println("Enter the Movie Name...");
			String mname=sc.next();
			
			System.out.println("Enter the Actor name For Movie");
			String [] actorname= new String[2];
			
		for(int j=0;j<actorname.length;j++)	{
			actorname[j]=sc.next();
			
		}
		
		
		m[i]= new Movie(mid,mname, actorname);
		
			
			
			
		}
		System.out.println("..............................");
		
		for (int i= 0;i<m.length;i++) {
			
			System.out.println(m[i]);
		}
		

	}

}

























































package com.ArrayOfObject;

import java.util.Scanner;

class Department
{
	private int did;
	private String dname;
	private String location;
	
	
	public void setDid(int did)
	{
		this.did=did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public int getDid()
	{
		return did;
	}
	public String getDname()
	{
		return dname;
	}
	public String getLocation()
	{
		return location;
	}
	
}

public class ObjectArray3 {

	public static void main(String[] args) {
			Department[] d=new Department[3];
			Scanner sc=new Scanner(System.in);
			System.out.println("Department Records");
			for(int i=0;i<d.length;i++) {
				
				System.out.println("Entre the did");
				int did=sc.nextInt();
				System.out.println("Entre department name");
				String dname=sc.next();
				System.out.println("Enter the location");
				String location=sc.next();
				
//				Department dept=new Department();
//				dept.setDid(did);
//				dept.setDname(dname);
//				dept.setLocation(location);
//				
//				d[i]=dept;
				
				d[i]=new Department();
				d[i].setDid(did);
				d[i].setDname(dname);
				d[i].setLocation(location);
				
				
			}
			
			
			System.out.println("................................");
			
			for(int i=0;i<d.length;i++)
			{
				System.out.println(d[i].getDid()+" "+d[i].getDname()+" "+d[i].getLocation());
			}

	}

}





























