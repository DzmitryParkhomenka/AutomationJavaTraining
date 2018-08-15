package by.exercices.dzmitry.parkhomenka.l2_3;

import java.util.*;

public class Lesson02_3 {

	public static void main(String[] args) {
		int a = 0;
		int ch = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Number of digits to enter?");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}

		double[] mas = new double[a];

		for (int i = 0; i < a; i++) {
			System.out.print(">");
			if (sc.hasNextFloat()) {
				mas[i] = sc.nextFloat();
			}
			
			if ((mas[i] % 2 == 0) && (mas[i] > 15)) {
				ch++;
			}
		}
		
		System.out.println("Четных и > 15 - " + ch);
	}
}
