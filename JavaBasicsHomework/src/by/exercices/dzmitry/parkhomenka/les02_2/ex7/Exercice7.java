package by.exercices.dzmitry.parkhomenka.les02_2.ex7;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		int[] mas = new int[5];
		
		enterArrayFromKeyboard(mas);
		showArray(mas);
		findMinMax(mas);
		sortArray(mas);
		showArray(mas);
	}

	public static void enterArrayFromKeyboard(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "]=>");
			mas[i] = sc.nextInt();
		}
	}

	public static void showArray(int[] mas) {
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}

		System.out.println();
		System.out.println("----------------------------------------------------------------------");
	}

	public static void findMinMax(int[] mas) {
		if (mas.length == 0) {
			System.out.println("Array length is 0");
		}

		int min, max;
		int minIndex, maxIndex;

		min = mas[0];
		minIndex = 0;
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
				minIndex = i;
			}
		}

		max = mas[0];
		maxIndex = 0;
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				maxIndex = i;
			}
		}

		System.out.println("Min element is " + min + " is on " + minIndex + " index.");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Max element is " + max);
		System.out.println("----------------------------------------------------------------------");
	}

	public static void sortArray(int[] mas) {
		int minValueIndex = 0;

		for (int i = 0; i < mas.length; i++) {
			minValueIndex = i;
			
			for (int j=i+1; j<mas.length; j++) {
				if (mas[j] < mas[minValueIndex]) {
					minValueIndex = j;
				}
			}
			
			int temp = mas[i];
			mas[i] = mas[minValueIndex];
			mas[minValueIndex] = temp;
		}
	}
}
