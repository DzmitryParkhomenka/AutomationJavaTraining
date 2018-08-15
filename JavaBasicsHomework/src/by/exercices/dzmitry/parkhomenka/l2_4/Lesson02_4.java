package by.exercices.dzmitry.parkhomenka.l2_4;

import java.util.Scanner;

public class Lesson02_4 {

	public static void main(String[] args) {
		int a = 0, bol = 0, men = 0, sumOst = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество цифр");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		
		int[] mas = new int[a];
		
		for (int i = 0; i < a; i++) {
			System.out.print(">");
			if (sc.hasNextInt()) {
				mas[i] = sc.nextInt();
			}
			
			if (mas[i] > 15) {
				bol++;
			}
			
			if (mas[i] < 2) {
				men++;
			}
			
			if (mas[i] % 5 == 4) {
				sumOst = sumOst + mas[i];
			}
		}
		
		System.out.println("Больше 15 и меньше 2 - " + bol);
		System.out.println("Больше 15 и меньше 2 - " + men);
		System.out.println("Делятся на 5 с остатком 4 - " + sumOst);
	}
}
