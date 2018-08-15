package by.exercices.dzmitry.parkhomenka.l2_6;

import java.util.Scanner;

public class Lesson02_6a {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
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
		
		x = b + Math.sqrt(b * b + 4 * a * c);
		y = 2 * a;
		z = Math.pow(a, 3) * c + b;
		
		rez = x / y - z;
		
		System.out.println("Результат выражения а = " + rez);
	}
}
