package by.exercices.dzmitry.parkhomenka.l2_10;

import java.util.Scanner;

public class Lesson02_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = 0, fx;

		System.out.println("Enter x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}

		if (x <= -3) {
			fx = 9;
			System.out.println("F(x) = " + fx);
		} else if (x > 3) {
			fx = 1 / Math.pow(x, 2) + 1;
			System.out.println("F(x) = " + fx);
		} else {
			System.out.println("Out of scope of definitions");
		}
	}
}
