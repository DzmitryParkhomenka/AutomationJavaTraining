package by.exercices.dzmitry.parkhomenka.les03_1.ex3;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		int a = 0;
		boolean asc = true;

		a = enterArraySize(a);
		int[] mas = new int[a];
		fillArray(mas);
		asc = checkAsc(mas, asc);
		showRez(asc);
	}

	public static int enterArraySize(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		a = sc.nextInt();
		return a;
	}

	public static void fillArray(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "]=>");
			mas[i] = sc.nextInt();
		}
	}

	public static boolean checkAsc(int[] mas, boolean asc) {
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < mas[i - 1]) {
				asc = false;
			}
		}
		return asc;
	}

	public static void showRez(boolean asc) {
		System.out.println("Is array ascending? - " + asc);
	}
}
