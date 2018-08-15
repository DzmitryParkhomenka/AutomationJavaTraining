package by.exercices.dzmitry.parkhomenka.les04_1.ex2;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		Random rand = new Random();
		
		//инициализация двумерного массива
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
				
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
		
		//сортировка массива по столбикам
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int n = 0; n < mas.length; n++) {
					for (int m = 0; m < mas.length; m++) {
						if (mas[m][n] > mas[i][j]) {
							int temp = mas[m][n];
							mas[m][n] = mas[i][j];
							mas[i][j] = temp;
						}
					}
				}
			}
		}
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
