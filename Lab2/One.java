import java.util.Scanner;

public class One {
	public static void main (String args[]) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int number1 = number.nextInt();
		System.out.println("Enter the second integer");
		int number2 = number.nextInt();
		
		//does the actual math
		
		int sum1 = number1 + number2;
		int sum2 = number1 - number2;
		int sum3 = number1 * number2;
		double sum4 = (double)number1 / number2;
		int sum5 = number1 % number2;
		int sum6 = (number1 + number2)/2;
		int sum7 = Math.abs (number1 - number2);
		int sum8 = Math.max (number1,number2);
		int sum9 = Math.min (number1,number2);
		
		//prints out results
		System.out.println(number1 + "+" + number2 + "=" + sum1);
		System.out.println();
		System.out.println(number1 + "-" + number2 + "=" + sum2);
		System.out.println();
		System.out.println(number1 + "*" + number2 + "=" + sum3);
		System.out.println();
		System.out.println(number1 + "/" + number2 + "=" + sum4);
		System.out.println();
		System.out.println(number1 + "%" + number2 + "=" + sum5);
		System.out.println();
		System.out.println("The average of " + number1 + " and " + number2 + " is " + sum6);
		System.out.println();
		System.out.println("The distance between " + number1 + " and " + number2 + " is " + sum7);
		System.out.println();
		System.out.println("The greatest value of " + number1 + " and " + number2 + " is " + sum8);
		System.out.println();
		System.out.println("The least value of " + number1 + " and " + number2 + " is " + sum9);
		System.out.println();
	}
}