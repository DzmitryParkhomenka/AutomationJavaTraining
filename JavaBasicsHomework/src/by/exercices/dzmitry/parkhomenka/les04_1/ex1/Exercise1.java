package by.exercices.dzmitry.parkhomenka.les04_1.ex1;

public class Exercise1 {

	public static void main(String[] args) {
		int mas[][] = new int[5][5];
		mas[0][0] = 1;
		mas[0][1] = 2;
		
		//заполнение первой строки массива
		for (int i = 0; i < mas.length; i++) {
				for (int j = 2; j < mas.length; j++) {
					mas[0][j] = mas[0][j - 1] + mas[0][j - 2];
				}
			}
		
		//заполнение со 2 и до последней строки массива
		for (int i = 1; i < mas.length; i++) {
			mas[i][0] = mas[i - 1][3] + mas[i - 1][4];
			mas[i][1] = mas[i][0] + mas[i - 1][4];
			for (int j = 2; j < mas.length; j++) {
				mas[i][j] = mas[i][j - 2] + mas[i][j - 1];
			}
		}
		
		//вывод массива на консоль
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.printf("[%-6d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
