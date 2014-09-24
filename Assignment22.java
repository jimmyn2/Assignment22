/**
* Purpose: Sum and average of 5 numbers
* @author: jimbo_000
* Date: 9/23/14 
* Pseudocode:
*	Start
*	Init num array, sum, average
*	Prompt enter 5 numbers
*	While numbers < 5 do
*		Read numbers and store to num[index]
*		Calculate sum = sum + num[index]
*		Increment index++
*	Calculate average = sum / 5
*	Display sum
*	Display average
*	End
*/

import java.util.Scanner;

public class Assignment22
{
	public static void main(String[] args)
	{
		double[] num = new double[5];
		double average, sum = 0;
		//Read numbers and compute their average:
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");

		for(int index = 0; index < 5; index++)
	{
		num[index] = keyboard.nextDouble();
		sum = sum + num[index];
	}
		average = sum / 5;
	System.out.println("The sum is " + sum);
	System.out.println("The average number is " + average);
	}
}

