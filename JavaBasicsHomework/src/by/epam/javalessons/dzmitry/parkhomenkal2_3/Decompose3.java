package by.epam.javalessons.dzmitry.parkhomenkal2_3;

import java.util.Scanner;

public class Decompose3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, y = 0;
		
		System.out.println("Enter x: ");
		x = sc.nextDouble();
		
		y = calcY(x);
		
		System.out.println("y=" + y);
		
		System.out.println("Enter x: ");
		x = sc.nextDouble();
		
		y = calcY(x);
		
		System.out.println("y(" + x + ")=" + y);
	}
	
	public static double calcY(double x) {
		double fx;
		if (x >= 3) {
			fx = -x * x + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		
		return fx;
	}
}
