package com.Problem2;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many student you need");
		 int data = scan.nextInt();
		 
		
		
//		Student obj = new Student(int r,String name,String ad,int mar);
		Student arr[] = new Student[data];
		
				
				
				for(int i=0; i<arr.length; i++)
				{
					
					 
					System.out.println("Enter Your Roll Number");
					int r = scan.nextInt();
					System.out.println("Enter Your Name ");
					String name = scan.next();
					System.out.println("Enter Your adress");
					String ad = scan.next();
					System.out.println("Enter your Marks");
					int mar = scan.nextInt();
					
					arr[i] = new Student(r, name, ad, mar);
					
					System.out.println("Roll :"+arr[i].getRoll());
					System.out.println("Name :"+arr[i].getName());
					System.out.println("Adress :"+arr[i].getAddress());
					System.out.println("Marks :"+arr[i].getMarks());
					System.out.println("**********************************");
					System.out.println("Next details");
					
					
				
//					
					
				}
	}

}
