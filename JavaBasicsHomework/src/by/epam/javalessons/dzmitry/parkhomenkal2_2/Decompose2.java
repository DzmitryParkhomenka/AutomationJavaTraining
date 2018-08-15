package by.epam.javalessons.dzmitry.parkhomenkal2_2;

import java.util.*;

public class Decompose2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		
		System.out.println("Enter x: ");
		x = sc.nextDouble();
		
		calcY(x);
		
		System.out.println("Enter x: ");
		x = sc.nextDouble();
		
		calcY(x);
	}
	
	public static void calcY(double x) {
		double fx;
		if (x >= 3) {
			fx = -x * x + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		
		System.out.println("x = " + x + "; y = " + fx);
	}
}
