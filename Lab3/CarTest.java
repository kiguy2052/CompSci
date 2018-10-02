import java.util.Scanner;

public class CarTest{
	public static void main(String[] args)
	{
		Car car1 = new Car(27000);
		System.out.println("This car currently costs "+car1.getPrice());
		Scanner newprice = new Scanner(System.in);
		System.out.println("What is the new cost?");
		int pricenew = newprice.nextInt();
		System.out.println("This car costs "+car1.changePrice(pricenew));
		System.out.println("What is the year of this car?");
		Scanner newyear = new Scanner(System.in);
		int yearnew = newyear.nextInt();
		System.out.println("This car's year is " +car1.getYear(yearnew)+ ".");
	}
}