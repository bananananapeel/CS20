/*

Program: distanceP2.java          Last Date of this Revision: September 14, 2022

Purpose: An application that calculates the total distance of a race with the values given by user

Author: Anjali Sanjay, 
School: CHHS
Course: Computer Programming 20
 

*/

package skillBuilding;

import java.util.Scanner;

public class distanceP2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the distance in KM of the first segment?");
		int f = input.nextInt();
		
		System.out.println("What is the distance in KM of the second segment?");
		int s = input.nextInt();
		
		System.out.println("What is the distance in KM of the third segment?");
		int t = input.nextInt();
		
		int total = f + s + t; 
		
		System.out.println("The total distance of the run would be: "+ total);

	}

}
/*
 screen dump
 
 What is the distance in KM of the first segment?
2
What is the distance in KM of the second segment?
2
What is the distance in KM of the third segment?
2
The total distance of the run would be: 6
*/
 
