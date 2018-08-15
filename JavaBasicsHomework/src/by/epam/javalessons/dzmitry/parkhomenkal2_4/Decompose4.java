package by.epam.javalessons.dzmitry.parkhomenkal2_4;

import java.util.Scanner;

public class Decompose4 {

	public static void main(String[] args) {
		double x = 0, y = 0;

		x = readXFromConsole();
		y = calcY(x);
		printResult(x, y);

		x = readXFromConsole();
		y = calcY(x);
		printResult(x, y);
	}

	// метод высчитывает F(x)
	public static double calcY(double x) {
		double fx;
		if (x >= 3) {
			fx = -x * x + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		return fx;
	}

	// метод чтения ввода из консоли
	public static double readXFromConsole() {
		Scanner sc = new Scanner(System.in);
		int x = 0;

		System.out.println("Enter x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter x: ");
		}
		x = sc.nextInt();

		return x;
	}

	// метод вывода результата в консоль
	public static void printResult(double x, double y) {
		System.out.println("y(" + x + ")=" + y + ";");
	}
}
