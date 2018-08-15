package by.exercices.dzmitry.parkhomenka.l2_7;

import java.util.Scanner;

public class Lesson02_7 {

	public static void main(String[] args) {
		int size = 3;
		double[] mas = new double[size];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите 3 действительных числа");
		for (int i = 0; i < size; i++) {
			mas[i] = sc.nextInt();
		}
		
		for (int i = 0; i < size; i++) {
			if (mas[i] > 0) {
				mas[i] = Math.pow(mas[i], 2);
				System.out.println("Элемент номер " + i + " положительный и был возведен в квадрат. Теперь его значение: " + (int) mas[i]); 
			} else if (mas[i] < 0) {
				mas[i] = Math.pow(mas[i], 4);
				System.out.println("Элемент номер " + i + " отрицательный и был возведен в 4 степень. Теперь его значение: " + (int) mas[i]);
			} else {
				System.out.println("Элемент номер " + i + " равен нулю. Ноль - не является положительным либо отрицательным числом");
			}
		}
	}
}
