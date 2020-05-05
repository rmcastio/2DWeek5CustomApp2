package edu.whccd.rcastillo;

import java.util.Scanner;

/* This custom application is to show the use of exception handling
    Author: Richard Castillo
 */

public class Main {

    public static void main(String[] args) {
		int userInput;
    	Scanner sc = new Scanner(System.in);




	try {
		System.out.print("Enter a Integer: ");
		userInput = sc.nextInt();
		System.out.println(userInput + " is valid");

    } catch (Exception e) {
	    System.out.println(" Invalid Input");
    } finally {
	    System.out.println("This finally block will run regardless if there is an exception or not");
    }


    }
}
