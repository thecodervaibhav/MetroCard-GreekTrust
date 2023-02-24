package com.example.geektrust.stations;

public class CentralStation {

	private static Integer totalFare=0;
	private static Integer totalFareWithDiscount=0;
	
	public Integer Total_Station_Amount_Collection(Integer fare_charge_amount) {
		totalFare+=fare_charge_amount;
		return totalFare;
	}


	public Integer Total_Discount_By_Station(Integer dicount_amount) {
		totalFareWithDiscount+=dicount_amount;
		return totalFareWithDiscount;
	}
	
}
