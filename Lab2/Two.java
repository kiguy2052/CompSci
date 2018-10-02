import java.lang.*;

public class Two {
	public static void main (String args[]) {
		
		//generate random numbers
		double number1 = Math.random()*100;
		double number2 = Math.random()*100;
		double number3 = Math.random()*100;
		double number4 = Math.random()*100;
		double number5 = number1+number2+number4+number3;
		double number6 = (number1 + number2 + number3 + number4)/2;
		
		//prints numbers
		System.out.println("\nYour random numbers are " +number1+ ", " +number2+ ", \n " +number3+ ", and " +number4+ "\n");
		System.out.println(+number1+ "+" + +number2+ "+" + +number3+ "+" + +number4+ "=" +number5+ "\n");
		System.out.println("The average of these numbers is " +number6);
	
	}
}