package com.example.geektrust;

import java.io.IOException;
import java.util.Scanner;

import com.example.geektrust.balance.MetroCardBalance;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // Sample code to read from file passed as command line argument
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Welcome to my application");
    	System.out.println("please enter you choice");
    	String input=sc.next();
        try {
            /*
        	the file to be opened for reading
        	 FileInputStream fis = new FileInputStream(args[0]);
              file to be scanned
            returns true if there is another line to read
        	
        	
            while (sc.hasNextLine()) {
               //Add your code here to process input commands
            }
            */
        	
        	if(input.equalsIgnoreCase("BALANCE")) {
        		System.out.println("Im in balance section");
        		String Metro_Card_Number = "metrocard1";
        		Integer Update_Balnce_Amount=1000;
        		
        		MetroCardBalance updateBalance=new MetroCardBalance(Metro_Card_Number,Update_Balnce_Amount);
        		updateBalance.updateMetroCardBalance();
        		
        	}
           
        }
        finally {
        	 sc.close(); // closes the scanner
		}
       
    }
}
