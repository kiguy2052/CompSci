import java.util.Scanner;

public class BankAccount{
	public BankAccount(double z){
		this.balance = z;
	}
	
	
	public void deposit(){
		//starts scanner
		Scanner in = new Scanner(System.in);
		//requests user input
		System.out.println("The balance is " +this.balance);
		System.out.println("How much would you like to deposit?");
		double dep = in.nextDouble();
		this.balance = (this.balance + dep);
		return;
	}
	
	public void withdraw(){
		//starts scanner
		Scanner in2 = new Scanner(System.in);
		//requests user input
		System.out.println("The balance is " +this.balance);
		System.out.println("How much would you like to withdraw?");
		double wit = in2.nextDouble();
		this.balance = (this.balance - wit);
		return;
	}
	
	
	public void getInterest(){
		Scanner in3 = new Scanner(System.in);
		System.out.println("The balance is " +this.balance);
		System.out.println("What is the annual interest rate as a percent?");
		this.annualRate = in3.nextDouble();
	}
	
	
	public void addInterest(){
		this.balance = ((this.balance * (this.annualRate*0.01))+this.balance);
	}
	
	
	public double getBalance(){
		return this.balance;
	}
	
	
	public void printBalance(){
		System.out.println("The balance is " +this.balance);
	}
	
	
	private double balance;
	private double annualRate;
	
}
