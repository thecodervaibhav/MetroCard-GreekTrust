package com.example.geektrust.stations;

public class Airport {

	private static Integer Total_Airport_Collection=0;
	private static Integer Total_Discount_By_Airport=0;

	public Integer Total_Station_Amount_Collection(Integer fare_charge_amount) {
	
		Total_Airport_Collection+=fare_charge_amount;
		return Total_Airport_Collection;
	}
	public Integer Total_Discount_By_Station(Integer dicount_amount) {
		return null;
	}
}
