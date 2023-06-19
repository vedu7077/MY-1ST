package com.arrays2;

import java.util.Scanner;

class Order1{
	
	int o_id;
	String cus_name;
	int quentity;
	String status;
	
	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}


	public int getQuentity() {
		return quentity;
	}


	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	//Order1(int iod,String cus_name,int quentity,String status){
		//this.o_id=o_id;
		//this.cus_name=cus_name;
		//this.quentity=quentity;
		//this.status=status;

	
	
	public String toString() {
		
		return o_id+" "+cus_name+" "+quentity+" "+status;
	}
public class Order {
	public static void main(String[] args) {

		
		Order1 [] o=new Order1[1];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Order.......");
		for(int i=0;i<o.length;i++) {
			
			System.out.println("Enter the order ID");
			int o_id=sc.nextInt();
			
			System.out.println("Enter the Customer Name");
			String cus_name=sc.next();
			
			System.out.println("Enter The Quentity");
			int quentity=sc.nextInt();
			
			System.out.println("Enter the  Status");
			String status=sc.next();
			
			
			
			
			o[i]=new Order1();
			o[i].setO_id(o_id);
			o[i].setCus_name(cus_name);
			o[i].setQuentity(quentity);
			o[i].setStatus(status);
		}
		
		System.out.println("..........................");
		
		for(int i=0;i<o.length;i++) {
			System.out.println(o[i]);
		}
	}

}}
