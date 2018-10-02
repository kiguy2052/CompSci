import java.util.Scanner;

public class Seven {
	public static void main (String args[]) {
		Scanner millisecs = new Scanner(System.in);
		System.out.println("Enter a value for milliseconds");
		int ms = millisecs.nextInt();
		
		
		//declares vars
		double sec = (ms/1000);
		double sixty = 60;
		int min = ((int)sec/60);
		int hour = (min/60);
		int day = hour/24;
		
		//does math
		int dayres = day;
		int hourres = hour-(day*24);
		int minres =  min-(hour*60);
		double secres = sec-(min*60);
		
		
		System.out.println(ms+ " milliseconds is the same as \n" +hourres+ " hours, " +minres+ " minutes and " +secres+ " seconds.");
	}
}