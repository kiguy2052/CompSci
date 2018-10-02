import java.util.Scanner;

public class Six {
	public static void main (String args[]) {
		Scanner ints = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int number1 = ints.nextInt();
		System.out.println("Enter the second integer");
		int number2 = ints.nextInt();
		System.out.println("Enter the third integer");
		int number3 = ints.nextInt();
		System.out.println("Enter the fourth integer");
		int number4 = ints.nextInt();
		int number5 = Math.max(number1,number2);
		int number6 = Math.max(number3,number4);
		int number7 = Math.max(number5,number6);
		System.out.println("The maximum of " + number1 + ", " + number2 + ", " + number3 + " and " + number4 + " is " +number7);
	}
}