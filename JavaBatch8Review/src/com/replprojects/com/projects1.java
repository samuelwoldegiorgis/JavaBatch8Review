package com.replprojects.com;

import java.util.Scanner;

public class projects1 {
	
	public static void main(String[] args) {
		
	int a=10;
	int b;
	b=90;
        Scanner scan;
		boolean answer;
		double balance;
		   scan=new Scanner(System.in);
		   System.out.println("Please enter if you have a credit card (true/false)");
	
		     answer=scan.nextBoolean();
		     
		  if(answer) {
			  System.out.println("What is the balance on your card?");
			  balance=scan.nextDouble();
			  if(balance>1000) {
				  System.out.println("Please pay off your card balance");
			  }else {
				  System.out.println("Spend more");
			  }
		  }else {
			  System.out.println("Would you like to get a credit card?");
		  
		 
		  
	
	}  
		
	}
	}

