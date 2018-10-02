import java.util.Scanner;

public class Four {
	public static void main (String args[]) {
		Scanner milesinput = new Scanner(System.in);
		System.out.println("Enter a number of miles to convert to kilometers");
		double miles = milesinput.nextDouble();
		double kmconstant = 1.609344;
		double kilometers = miles*kmconstant;
		System.out.println("\n" +miles+ " miles = " +kilometers+ " kilometers");
	}
}