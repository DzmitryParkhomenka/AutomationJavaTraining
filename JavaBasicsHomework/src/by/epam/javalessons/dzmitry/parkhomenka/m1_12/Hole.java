package by.epam.javalessons.dzmitry.parkhomenka.m1_12;

import java.util.*;

public class Hole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, x = 0, y = 0, z = 0;
		
		System.out.println("Enter a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.println("Enter b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		System.out.println("Enter x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		System.out.println("Enter y: ");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		}
		System.out.println("Enter z: ");
		if (sc.hasNextDouble()) {
			z = sc.nextDouble();
		}
		
		if ((a > x) && (b > y)) {
			System.out.println("Fits.");
		} else if ((a > y) && (b > x)) {
			System.out.println("Fits");
		} else if ((a > x) && (b > z)) {
			System.out.println("Fits");
		} else if ((a > z) && (b > x)) {
			System.out.println("Fits");
		} else if ((a > y) && (b > z)) {
			System.out.println("Fits");
		} else if ((a > z) && (b > y)) {
			System.out.println("Fits");
		} else {
			System.out.println("Does not Fit");
		}
	}
}
