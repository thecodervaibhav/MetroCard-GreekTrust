package com.example.geektrust.passenger;

import java.util.HashMap;

import com.example.geektrust.balance.MetroCardBalance;

public class PassengerDetails {

	private static HashMap<String , Integer> passengerType=new HashMap<>();
	
	private static HashMap<String , Integer> passengerDiscount=new HashMap<>();
	
		
					//counting the total passenger for fare amount
						public void countPassenger(String type) {
						
						if( passengerType.containsKey(type) ) {
						
						Integer Count=passengerType.get(type);
							
						passengerType.put(type, (Count+1));
							
						}else {
						passengerType.put(type, 1);
						}
						
					}
	
				
						//calculating a fare for passenegr with according to there type
				
						public Double calculationFare(String type , String metroCardNumber) {
						
						countPassenger(type);
			
						Double fareAmount=0.0;
						
						if(type.equalsIgnoreCase("ADULT")) {
							
							fareAmount+=200;
						}
						
						else if(type.equalsIgnoreCase("SENIOR_CITIZEN")) {
							fareAmount+= 100;
						}
						
						else if(type.equalsIgnoreCase("KIDS")){
							fareAmount+= 50;
						}
						
						
						else {
							System.out.println("Invalid passenger Type please Enter correct Details");
						}
						
						
						
						//If passenger travells second time he will get discount
						
						boolean passengerDiscount=checkPassengerDiscount(metroCardNumber); 
						
						if(passengerDiscount) {
							return fareAmount/2;
						}else
						return fareAmount ;
						
						
					}

						
 			// checking discount of every passenger according to type 

			public boolean checkPassengerDiscount(String metroCardNumber) {
				
				if(passengerDiscount.containsKey(metroCardNumber)) {
					
					Integer BechMark=passengerDiscount.get(metroCardNumber);
					if(BechMark==1) {
						passengerDiscount.put(metroCardNumber, 0);
						return true;
					}else {
						passengerDiscount.put(metroCardNumber, 1);
						return false;
					}
				}else {
					passengerDiscount.put(metroCardNumber, 1);
					return false;
				}
				
			}
			
			
			//Final Payment for passenger after checking deatils
				public Integer Make_Payment_Card(String Metro_Card_Number, Integer fare) {
					
				MetroCardBalance metroCard=new MetroCardBalance();
				
				HashMap<String, Double> cardInformation=metroCard.getRECORD_METRO_CARD_NUMBER_AND_BALANCE();
				
				System.out.print(cardInformation);
				
				return null;
				
			}
	
	
}
