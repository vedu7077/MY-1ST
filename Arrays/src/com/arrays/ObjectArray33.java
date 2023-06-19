package com.arrays;





import java.util.Arrays;
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

public class ObjectArray33 {
	
	
	

	public static void main(String[] args) {
			Department[] d=new Department[3];
			Scanner sc=new Scanner(System.in);
			System.out.println("Department Records");
			for(int i=0;i<d.length;i++) {
				
				System.out.println("Entre the id");
				int did=sc.nextInt();
				System.out.println("Entre department name");
				String dname=sc.next();
				System.out.println("Enter the location");
				String location=sc.next();
				

				
				d[i]=new Department();
				d[i].setDid(did);
				d[i].setDname(dname);
				d[i].setLocation(location);
				
				
			}
			
			
			System.out.println("................................");
			 System.out.println(Arrays.toString(d));
		//	for(int i=0;i<d.length;i++)
			//{
				//System.out.println(d[i].getDid()+" "+d[i].getDname()+" "+d[i].getLocation());
			//}

	}

}
