package by.exercices.dzmitry.parkhomenka.l2_5;

public class Lesson02_5 {

	public static void main(String[] args) {
		int a = 0;

		// вывод в консоль размера массива
		System.out.println("Размер массива с аргументами: " + args.length);

		System.out.println("");

		// вывод аргументов командной строки в консоль
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		System.out.println("");

		// вычисляем сумму аргументов командной строки
		for (int i = 0; i < args.length; i++) {
			a = a + Integer.parseInt(args[i]);
		}

		System.out.println("Сумма аргументов командной строки равна: " + a);
	}
}
