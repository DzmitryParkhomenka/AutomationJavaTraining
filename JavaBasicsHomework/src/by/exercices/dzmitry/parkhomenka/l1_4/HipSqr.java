package by.exercices.dzmitry.parkhomenka.l1_4;

import java.util.*;

public class HipSqr {

	public static void main(String[] args) {
		int a;
		int b;
		double hip;
		double sqr;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number a: ");
		while (!sc.hasNextInt()) {
			System.out.println("Enter a number, please");
			sc.next();
		}
		a = sc.nextInt();
		
		System.out.println("Enter number b: ");
		while (!sc.hasNextInt()) {
			System.out.println("Enter a number, please");
			sc.next();
		}
		b = sc.nextInt();
		
		hip = Math.sqrt(a * a + b * b);
		sqr = (a * b) * 0.5;
		
		System.out.println("Hypotenuse equals " + hip);
		System.out.println("Square equals " + sqr);
	}
}
