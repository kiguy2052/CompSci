import java.lang.*;
import java.util.Scanner;

public class Three {
	public static void main (String args[]) {
		Scanner radiusvalue = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = radiusvalue.nextInt();
		
		//does math
		double area = Math.PI*(radius*radius);
		double circumference = 2*Math.PI*radius;
		double surfacearea = 4*Math.PI*(radius*radius);
		double volume = (4.0/3)*Math.PI*(radius*radius*radius);
		
		//prints results
		System.out.println("\nRadius ="+radius);
		System.out.println("\nArea ="+area);
		System.out.println("\nCircumference ="+circumference);
		System.out.println("\nSurface Area ="+surfacearea);
		System.out.println("\nVolume ="+volume);
	}
}