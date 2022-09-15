/*

Program: digits.java          Last Date of this Revision: September 15, 2022

Purpose: An application that calculates the digit in each number place

Author: Anjali Sanjay, 
School: CHHS
Course: Computer Programming 20
 

*/

package skillBuilding;

import java.util.Scanner;

public class digits 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a two digit number: "); //display question
		
		int digits = input.nextInt(); //user input numbers
		
		int firstD = digits / 10; //first digit
		
		int secondD = (digits % 10); //second digit
		
		System.out.println("The tens-place digit is: "+ firstD); //display digit
		
		System.out.println("The ones-place digit is: "+ secondD); //display digit
	}

}
/*
screen dump

Enter a two digit number: 
45
The tens-place digit is: 4
The ones-place digit is: 5

*/