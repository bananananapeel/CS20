/*

Program: gradeAvgP1.java          Last Date of this Revision: September 15, 2022

Purpose: An application that calculates the average of the grades the user has inputed

Author: Anjali Sanjay, 
School: CHHS
Course: Computer Programming 20
 

*/

package skillBuilding;

import java.util.Scanner;

public class gradeAvgP1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your math grade: ");
		int mg = input.nextInt();
		
		System.out.println("Please enter your english grade: ");
		int eg = input.nextInt();
		
		System.out.println("Please enter your social grade: ");
		int sg = input.nextInt();

		System.out.println("Please enter your science grade: ");
		int scig = input.nextInt();
		
		System.out.println("Please enter your computer science grade: ");
		int csg = input.nextInt();
		
		int avg = (mg+eg+sg+scig+csg) / 5;
		
		System.out.println("Your average is : "+ avg+"%");
		
	}

}
/*
 screen dump
 
 Please enter your math grade: 
45
Please enter your english grade: 
56
Please enter your social grade: 
65
Please enter your science grade: 
45
Please enter your computer science grade: 
76
Your average is : 57%

*/
