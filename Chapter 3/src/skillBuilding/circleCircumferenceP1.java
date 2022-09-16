

package skillBuilding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class circleCircumferenceP1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//scans users answers
		
		DecimalFormat df = new DecimalFormat("0.0");//changes to decimal format

		
		System.out.println("Please enter the radius of your circle: ");//prompts user
		double r = input.nextDouble();//records answer
		
	    final double pi = 3.14;  //makes pi a variable
		
		double c = 2*pi*r;//calculate circumference of circle
		
		System.out.println("The circumference of the circle would be: "+ df.format(c));//displays circumference
	}

}
/*
screen dump

Please enter the radius of your circle: 
2
The circumference of the circle would be: 12.6

*/