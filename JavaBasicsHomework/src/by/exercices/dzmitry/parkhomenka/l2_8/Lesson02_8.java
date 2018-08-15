package by.exercices.dzmitry.parkhomenka.l2_8;

import java.util.Scanner;

public class Lesson02_8 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("Enter b:");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.println("Enter c:");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		
		for (double i = a; i <= b; i = i + c) {
			if (a == 0) {
				System.out.println("Division by zero error");
			} else {
				System.out.println("x = " + a + " y = " + 2 * Math.tan(a / 2) + 1);
			}
			a = a + c;
		}
	}
}
