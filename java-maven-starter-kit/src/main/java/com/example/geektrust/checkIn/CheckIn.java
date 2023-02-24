package com.example.geektrust.checkIn;

import java.util.HashMap;

import com.example.geektrust.balance.MetroCardBalance;
import com.example.geektrust.passenger.PassengerDetails;
import com.example.geektrust.stations.Airport;
import com.example.geektrust.stations.CentralStation;

public class CheckIn {

	private String passengerType;
	private String jorneyStation;
	private String metroCardNumber;
	
	
	public CheckIn(String passengerType, String jorneyStation, String metroCardNumber) {
		super();
		this.passengerType = passengerType;
		this.jorneyStation = jorneyStation;
		this.metroCardNumber = metroCardNumber;
	}
	
	
	public void checkMetroCardDetails() {
		
		MetroCardBalance metroCardBalance=new MetroCardBalance();
		
		PassengerDetails pas=new PassengerDetails();
		
		Double fare =pas.calculationFare(passengerType,metroCardNumber);
	
		//need to check balance first then fare will cut from main account
		
		System.out.println( passengerType +" Travells Charges is : "+fare);
		
			
		
		if(jorneyStation.equalsIgnoreCase("AIRPORT")) {
			
			Airport airportStation=new Airport();	
		}else {
			CentralStation centralStation=new CentralStation();
		}
		
	}
	
}
