import java.util.Scanner;

public class Five {
	public static void main (String args[]) {
		Scanner monthinput = new Scanner(System.in);
		System.out.println("Enter an integer 1 through 12 to turn into a month");
		int month = monthinput.nextInt();
		int monthsub = month*10;
		String monthstring = "January   February  March     April     May       June      July      August    September October   November  December  ";
		System.out.println(monthstring.substring(monthsub-10,(monthsub)) );
	}
}