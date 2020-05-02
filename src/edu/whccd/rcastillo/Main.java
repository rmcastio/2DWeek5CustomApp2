package edu.whccd.rcastillo;

import java.util.Scanner;;import static java.util.Scanner.*;

/* This custom application is to show the use of exception handling
    Author: Richard Castillo
 */

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);


	System.out.println("Enter a Integer: ");
	int userInput = Scanner.nextInt();
	try {
	     System.out.println(userInput + "is valid");
    } catch (Exception e) {
	    System.out.println("Invalid Input");
    } finally {
	    System.out.println("This finally block will run regardless if there is an exception or not");
    }


    }
}
