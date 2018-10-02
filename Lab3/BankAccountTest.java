import java.util.Scanner;

public class BankAccountTest{
	public static void main(String[] args){
		
		
		//setup inputs
		Scanner balpet = new Scanner(System.in);
		Scanner balpau = new Scanner(System.in);
		Scanner balmar = new Scanner(System.in);
		
		//peter boi
		System.out.println("What is Peter's balance?");
		double petbal = balpet.nextDouble();
		BankAccount Peter = new BankAccount(petbal);
	Peter.deposit();
	Peter.withdraw();
	Peter.getInterest();
	Peter.addInterest();
	Peter.getBalance();
	Peter.printBalance();
	
		//paul boi		
		System.out.println("What is Paul's balance?");
		double paubal = balpau.nextDouble();
		BankAccount Paul = new BankAccount(paubal);
	Paul.deposit();
	Paul.withdraw();
	Paul.getInterest();
	Paul.addInterest();
	Paul.getBalance();
	Paul.printBalance();
	
		//mary boi
		System.out.println("What is Mary's balance?");
		double marbal = balmar.nextDouble();
		BankAccount Mary = new BankAccount(marbal);
	Mary.deposit();
	Mary.withdraw();
	Mary.getInterest();
	Mary.addInterest();
	Mary.getBalance();
	Mary.printBalance();
	}
}