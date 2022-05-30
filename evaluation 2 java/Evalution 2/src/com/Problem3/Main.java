package com.Problem3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of passengers ");
		int numberofpassengers = scan.nextInt();
		System.out.println("Enter number of kms");
		int kms = scan.nextInt();

		
		Sedan s = new Sedan();
		HatchBack h = new HatchBack();
		OLA myOla = new OLA();
//		myOla.bookCar(numberofpassengers, numberofpassengers);
		Car myCar = myOla.bookCar(numberofpassengers, numberofpassengers);
		
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is "+res);
		
		
		
		
	}

}
