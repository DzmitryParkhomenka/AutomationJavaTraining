package by.exercices.dzmitry.parkhomenka.les03_1.ex2;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		int a = 0;

		a = enterArraySize(a);
		int[] mas = new int[a];
		fillArray(mas);
		int[] mas2 = null;
		mas2 = findNullElements(mas, mas2);
		showSum(mas2);

	}

	public static int enterArraySize(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		a = sc.nextInt();
		return a;
	}

	public static void fillArray(int[] mas) {
		System.out.println("Be sure to enter 0 several times into the array");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "]=>");
			mas[i] = sc.nextInt();
		}
	}

	public static int[] findNullElements(int[] mas, int[] mas2) {
		int a = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				a++;
			}
		}

		if (a == 0) {
			System.out.println("There are no 0 elements");
		}

		mas2 = new int[a];
		int b = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				mas2[b] = i;
				b++;
			}
		}
		return mas2;
	}

	public static void showSum(int[] mas2) {
		if (mas2.length == 0) {
			System.out.println();
		} else {
			System.out.println("----------------------------------------------------------");
			for (int i = 0; i < mas2.length; i++) {
				System.out.print("mas2[" + i + "]=" + mas2[i] + "; ");
			}
			System.out.println();
			System.out.println("----------------------------------------------------------");
		}
	}
}
