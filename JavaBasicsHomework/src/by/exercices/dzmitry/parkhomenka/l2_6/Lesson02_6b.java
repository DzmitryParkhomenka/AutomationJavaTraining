package by.exercices.dzmitry.parkhomenka.l2_6;

import java.util.Scanner;

public class Lesson02_6b {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		double x, y, z, rez;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите а: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}

		System.out.println("Введите b: ");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}

		System.out.println("Введите c: ");
		if (sc.hasNextInt()) {
			c = sc.nextInt();
		}
		
		System.out.println("Введите d: ");
		if (sc.hasNextInt()) {
			d = sc.nextInt();
		}

		x = a / c;
		y = b / d;
		z = (a * b - c) / c * d;

		rez = x * y - z;

		System.out.println("Результат выражения b = " + rez);
	}
}
