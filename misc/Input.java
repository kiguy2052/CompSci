//An example of input using scanner


import java.util.Scanner;

public class Input
{
	public static void main (String args[]) 							
	{  
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Number  ===>>  ");										
		int number1 = input.nextInt(); 					//read an integer
		System.out.print("Enter 2nd Number  ===>>  ");										
		int number2 = input.nextInt();
		int sum = number1 + number2;		
		System.out.println();																	
		System.out.println(number1 + " + " + number2 + " = " + sum);
		System.out.println();
		System.out.print("Enter a string  ===>>  ");
		String string1 = input.next();  				//read a string
		System.out.println(string1);
		System.out.print("Enter a double  ===>>  ");										
		double number3 = input.nextDouble();			//read a double
		System.out.println(number3);
	}
}
