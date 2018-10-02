import java.util.Scanner;

public class Car {
	public Car(int p){
		price=p;
	}
	
	public int changePrice(int y)
	{
		int price = y;
		return price;
	}
	
	public int getYear(int n)
	{
		int year = n;
		return year;
	}
	
	public int getPrice()
	{
		return price;
	}

	private String model;
	private String color;
	private int price;
	private int doors;
	private int year;
}
