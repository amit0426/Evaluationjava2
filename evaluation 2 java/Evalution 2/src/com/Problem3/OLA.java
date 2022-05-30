package com.Problem3;

public class OLA {

	private int numOfKms;
	private int farePerKm;
	

//	public OLA(int numOfKms, int farePerKm) {
//		super();
//		this.numOfKms = numOfKms;
//		this.farePerKm = farePerKm;
//	}

//	public void OLA1(int far, int fareper) {
//		// TODO Auto-generated constructor stub
//	}

	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		if(numberOfPassenger <=3)
		{
			return new HatchBack();
		}
		return new Sedan();
		
	}

	public int calculateBill(Car car)
	{
		int Total = numOfKms*farePerKm;
		return Total;
		
	}

	
	
}
