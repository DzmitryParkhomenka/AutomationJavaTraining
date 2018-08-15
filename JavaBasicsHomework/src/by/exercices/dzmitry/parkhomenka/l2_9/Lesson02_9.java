package by.exercices.dzmitry.parkhomenka.l2_9;

import java.util.Scanner;

public class Lesson02_9 {

	public static void main(String[] args) {
		double rad = 0, s, d;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter circle radius: ");
		if (sc.hasNextDouble()) {
			rad = sc.nextDouble();
		}

		d = 2 * Math.PI * rad;
		s = Math.PI * Math.pow(rad, 2);

		System.out.println("Circle length = " + d);
		System.out.println("Circle Square = " + s);
	}
}
