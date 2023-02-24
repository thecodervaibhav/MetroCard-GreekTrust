package com.example.geektrust.balance;

import java.util.HashMap;

public class MetroCardBalance {
	
	private static HashMap<String, Integer> RECORD_METRO_CARD_NUMBER_AND_BALANCE=new HashMap<>();
	
	private String Metro_Card_Number;
	private Integer Update_Balnce_Amount;
	
	public MetroCardBalance() {
		// TODO Auto-generated constructor stub
	}

	public MetroCardBalance(String metro_Card_Number, Integer update_Balnce_Amount) {
		super();
		Metro_Card_Number = metro_Card_Number;
		Update_Balnce_Amount = update_Balnce_Amount;
	}
	
	
	public void updateMetroCardBalance() {
		RECORD_METRO_CARD_NUMBER_AND_BALANCE.put(Metro_Card_Number, Update_Balnce_Amount);
	}

	
	//set a getter for getting a list of Updated balance
	public static HashMap<String, Integer> getRECORD_METRO_CARD_NUMBER_AND_BALANCE() {
		return RECORD_METRO_CARD_NUMBER_AND_BALANCE;
	}


	
	
	
}
