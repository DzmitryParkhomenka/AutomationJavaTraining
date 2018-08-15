package by.epam.javalessons.dzmitry.parkhomenka.m1_13;

import java.util.*;

public class Formula {

	public static void main(String[] args) {
		double h = 0, a, b, c, x1, x2, D;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter h: ");
		if (sc.hasNextDouble()) {
			h = sc.nextDouble();
		}

		a = Math.sqrt((Math.abs(Math.sin(8 * h)) + 17)) / Math.pow(1 - Math.sin(4 * h) * Math.cos(h * h + 18), 2);
		b = 1 - Math.sqrt(3 / (3 + Math.abs(Math.tan(a * h * h) - Math.sin(a * h))));
		c = a * h * h * Math.sin(b * h) + b * Math.pow(h, 3) * Math.cos(a * h);
		
		D = b * b - 4 * a * c;
		if (D < 0) {
			System.out.println("There is no valid roots");
		} else if (D == 0) {
			x1 = (-b) / (2 * a);
			System.out.println("There is 1 valid root - x=" + x1);
		} else {
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("There are two valid roots - x1="+ x1 + " and x2=" + x2);
		}
	}
}
