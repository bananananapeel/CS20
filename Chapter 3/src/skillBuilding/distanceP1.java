/*

Program: distanceP1.java          Last Date of this Revision: September 14, 2022

Purpose: An application that calculates the total distance of a race

Author: Anjali Sanjay, 
School: CHHS
Course: Computer Programming 20
 

*/

package skillBuilding;

import java.text.DecimalFormat;

public class distanceP1 
{

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("0.0");

		
		double firstseg = 12.2;
		double secondseg = 10.6;
		double thirdseg = 5.8;
		double total = firstseg + secondseg + thirdseg;
		
		System.out.println("If we added the distances of all the segments: "+ firstseg +" + "+ secondseg +" + "+ thirdseg );
		System.out.println("The totals distance of the race would be: "+df.format(total));
	}

}
/**
screen dump

If we added the distances of all the segments: 12.2 + 10.6 + 5.8
The totals distance of the race would be: 28.6

*/