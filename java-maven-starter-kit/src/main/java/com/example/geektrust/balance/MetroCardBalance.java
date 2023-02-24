package com.example.geektrust.balance;

import java.util.HashMap;

public class MetroCardBalance {
	
	private static HashMap<String, Double> RECORD_METRO_CARD_NUMBER_AND_BALANCE=new HashMap<>();
	
	private String Metro_Card_Number;
	private Double Update_Balnce_Amount;
	private Double MetroCardBalance;
	
	public MetroCardBalance() {}

	public MetroCardBalance(String metro_Card_Number, Double update_Balnce_Amount){
		super();
		Metro_Card_Number = metro_Card_Number;
		Update_Balnce_Amount = update_Balnce_Amount;
	}
	
	
	//method for updating (adding a new balance in Metro Card)
	public void addAmountMetroCard() {
		MetroCardBalance+=Update_Balnce_Amount;
	}
	
	//getter for getting a list of Updated balance
	public static HashMap<String, Double> getRECORD_METRO_CARD_NUMBER_AND_BALANCE() {
		return RECORD_METRO_CARD_NUMBER_AND_BALANCE;
	}

	public String getMetro_Card_Number() {
		return Metro_Card_Number;
	}
	
	
	
	
}