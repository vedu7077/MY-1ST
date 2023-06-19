package com.arrays;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	int salary;
	
	
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;	
	}
	
	public String toString() {
		return id+" "+name+" "+ salary;
		}
}
public class ObjectArrays1 {
	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee");
		
		
		
		
	for(int i = 0; i<emp.length;i++) {
		
		System.out.println("Enter ID...");
		int id=sc.nextInt();
		
		System.out.println("Enter name....");
		String name= sc.next();
		
		System.out.println("Enter salary.....");
		int salary=sc.nextInt();
		
		emp[i]= new Employee(id,name,salary);
		System.out.println("................");
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		else {
			
		
		System.out.println("Display Employee more than 20000 salary");
		
		}
		for (int i1=0;i1<emp.length;i1++) {
			if(emp[i].salary>20000) {
				System.out.println(emp[i].id+"  "+ emp[i].name+"  "+ emp[i].salary);
			}
			
			
		}
		
		
	}
		

		
		
	}

}
