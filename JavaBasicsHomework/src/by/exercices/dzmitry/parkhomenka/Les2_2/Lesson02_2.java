package by.exercices.dzmitry.parkhomenka.Les2_2;

import java.util.Scanner;

public class Lesson02_2 {

	public static void main(String[] args) {
		int x = 0, y = 0;
		int sum = 0, mul = 0;
		
		x = enterX(x);
		y = enterY(y);
		sum = countSum(x, y);
		mul = countMul(x, y);
		showRez(sum, mul);
	}
	
	//метод для чтения х из введенных символов в консоль
	public static int enterX(int x) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		x = sc.nextInt();
		return x;
	}

	//метод для чтения у из введенных символов в консоль
	public static int enterY(int y) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		y = sc.nextInt();
		return y;
	}

	//метод для вычисления суммы х и у
	public static int countSum(int x, int y) {
		int sum = x + y;
		return sum;
	}

	//метод для вычисления произведения х и у
	public static int countMul(int x, int y) {
		int mul = x * y;
		return mul;
	}

	//метод вывода результатов в консоль
	public static void showRez(int sum, int mul) {
		System.out.println("sum = " + sum + "; mul = " + mul);
	}
}
