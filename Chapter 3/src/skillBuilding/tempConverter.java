/*

Program: tempConverter.java          Last Date of this Revision: September 15, 2022

Purpose: An application that converts the temperature in fahernheit the user has given to celsius

Author: Anjali Sanjay, 
School: CHHS
Course: Computer Programming 20
 

*/

package skillBuilding;

import java.util.Scanner;

public class tempConverter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a temperature in Fahernheit:");//prompts user 
		int f = input.nextInt();//records users answer
		
		int c = ((f-32)*5)/9;  //converts fahernheit to celsius
		
		System.out.println(f +" degrees fahernheit in celsius is "+ c);//displays the temperature in celsius
	}

}

/**
Please enter a temperature in Fahernheit:
89
89 degrees fahernheit in celsius is 31
*/