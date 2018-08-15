package by.epam.javalessons.dzmitry.parkhomenka.m1_11;

import java.util.*;

public class Point2 {

	public static void main(String[] args) {
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		double a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x1 of A coordinate: ");
		if (sc.hasNextDouble()) {
			x1 = sc.nextDouble();
		}
		System.out.println("Enter y1 of A coordinate: ");
		if (sc.hasNextDouble()) {
			y1 = sc.nextDouble();
		}
		System.out.println("Enter x2 of B coordinate: ");
		if (sc.hasNextDouble()) {
			x2 = sc.nextDouble();
		}
		System.out.println("Enter y2 of B coordinate: ");
		if (sc.hasNextDouble()) {
			y2 = sc.nextDouble();
		}
		
		a = Math.sqrt(x1 * x1 + y1 * y1);
		b = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (a > b) {
			System.out.println("Point A is farther that point B");
		} else if (a < b) {
			System.out.println("Point B is farther that Point A");
		} else {
			System.out.println("Both points distance is equal");
		}
	}
}
