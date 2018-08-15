package by.epam.javalessons.dzmitry.parkhomenkal2_7;

import java.util.Random;
import java.util.Scanner;

public class WithArray {

	public static void main(String[] args) {
		int[] mas = new int[10];

		enterArrayWithRandom(mas);
		printArray(mas);
		findMaxElementAndIndex(mas);
		sortArray(mas);
		printArray(mas);
	}
	
	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i=0; i<mas.length; i++) {
			mas[i] = rand.nextInt(300);
		}
	}
	
	public static void enterArrayFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.println("ar[" + i + "]=>");
			mas[i] = sc.nextInt();
		}
	}

	public static void printArray(int[] mas) {
		System.out.println("------------------------------------------------");

		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "]=" + mas[i] + "; ");
		}

		System.out.println();
		System.out.println("------------------------------------------------");
	}

	public static void findMaxElementAndIndex(int[] mas) {
		if (mas.length == 0) {
			System.out.println("Array length is 0");
		}

		int max;
		int index;

		max = mas[0];
		index = 0;
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				index = i;
			}
		}

		System.out.println("Max element " + max + " is on " + index + " index.");
	}

	public static void sortArray(int[] mas) {
			int minValueIndex = 0;
			
			for (int i=0; i<mas.length; i++) {
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
