/*

Program: gradeAvgP2.java          Last Date of this Revision: September 15, 2022

Purpose: An application that calculates the average of the grades the user has inputed and sums them together as they are inputed

Author: Anjali Sanjay, 
School: CHHS
Course: Computer Programming 20
 

*/

package skillBuilding;

import java.util.Scanner;

public class gradeAvgP2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your math grade: ");//prompts user
		int mg = input.nextInt();//records user answer
		
		System.out.println("Please enter your english grade: ");//prompts user
		int eg = input.nextInt();//records user answer
		
		int t1 = mg + eg;//adds users grades together
		
		System.out.println(t1);//displays sum of users grades
		
		System.out.println("Please enter your social grade: ");//prompts user
		int sg = input.nextInt();//records user answer
		
		int t2 = t1 + sg;//adds users grades together
		
		System.out.println(t2);//displays sum of user grades

		System.out.println("Please enter your science grade: ");//prompts user
		int scig = input.nextInt();//records user answers
		
		int t3 =t2 + scig;//adds users grades together
		
		System.out.println(t3);//display sum of user grades
		
		System.out.println("Please enter your computer science grade: ");//prompts user
		int csg = input.nextInt();//records user answer
		
		int t4 = t3 + csg;//adds users grades together
		
		System.out.println(t4);//displays sum of users grades
		
		int avg = (mg+eg+sg+scig+csg) / 5;//calculates average
		
		System.out.println("Your average is : "+ avg+"%");//displays average
	}

}
/*
screen dump

Please enter your math grade: 
98
Please enter your english grade: 
86
184
Please enter your social grade: 
93
277
Please enter your science grade: 
87
364
Please enter your computer science grade: 
78
442
Your average is : 88%

*/