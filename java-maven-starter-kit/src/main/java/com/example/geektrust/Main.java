package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.example.geektrust.balance.MetroCardBalance;
import com.example.geektrust.checkIn.CheckIn;

public class Main {
    public static void main(String[] args) throws IOException {
        

//    	System.out.println("Welcome to my application");
//    	System.out.println("please enter you choice");
    	Scanner sc=null;
        try {
        	 FileInputStream fis = new FileInputStream(args[0]);
              sc = new Scanner(fis); // file to be scanned
             while (sc.hasNextLine()) {
             	String inputCommand = sc.nextLine();
             	System.out.println(inputCommand);
             	String[] input=inputCommand.trim().split(" ");
             	
             	if(input[0].equalsIgnoreCase("BALANCE")) {
       		
        		MetroCardBalance updateBalance=new MetroCardBalance(input[1],Double.parseDouble(input[2]));
        		updateBalance.addAmountMetroCard();
        		
             	}
        	
        	else if(input[0].equalsIgnoreCase("CHECK_IN")) {
        		
        		String Metro_Card_Number=input[1];
        		String passengerType=input[2];
        		String journeyStation=input[3];
        		
        		
//        		CheckIn checkIN= new CheckIn(passengerType,journeyStation,Metro_Card_Number);
        		CheckIn checkIN= new CheckIn(passengerType,journeyStation,Metro_Card_Number);
        		
        		
        		checkIN.checkMetroCardDetails();
        		
        	}else if (input[0].equalsIgnoreCase("PRINT_SUMMARY")) {
        		MetroCardBalance cardDetails =new MetroCardBalance();
        		System.out.println(cardDetails.getRECORD_METRO_CARD_NUMBER_AND_BALANCE());			
        	}
             	
        }
     
       
}catch (IOException e) {
	System.err.println(e.getMessage());
}finally {
sc.close();	
}
    }
}
