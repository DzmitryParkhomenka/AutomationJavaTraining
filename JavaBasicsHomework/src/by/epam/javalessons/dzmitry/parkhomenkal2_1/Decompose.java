package by.epam.javalessons.dzmitry.parkhomenkal2_1;

import java.util.Scanner;

public class Decompose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, fx;

		System.out.println("Enter x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}

		if (x >= 3) {
			fx = -x * x + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		System.out.println("F(x)=" + fx);
	}
}
