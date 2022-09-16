package mastery;

import java.util.Scanner;

public class Change 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner (System.in);
		
		System.out.println("Enter the change you have in cents: "); //asks how much change user has
		
		int change = userinput.nextInt();
		
		int quarters = change / 25; //calculate quarters in change
		
		int dimes = ((change % 25)/10);  //calculate dimes
		
		int nickles = ((change % 25)%10)/5; //calculate nickels
		
		int pennies = (((change % 25)%10)%5);
		
		System.out.println("The minimum amount of coins is: "); //displays change
		
		System.out.println("Quarters: "+ quarters); //displays change
		
		System.out.println("Dimes: "+ dimes); //displays change
		
		System.out.println("Nickles: "+ nickles); //displays change
		
		System.out.println("Pennies: "+ pennies); //displays change

	}

}
/*
screen dump

 Enter the change you have in cents: 
31
The minimum amount of coins is: 
Quarters: 1
Dimes: 0
Nickles: 1
Pennies: 1

*/
 