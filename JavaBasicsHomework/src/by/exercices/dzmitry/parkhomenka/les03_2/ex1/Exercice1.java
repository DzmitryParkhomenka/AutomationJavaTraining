package by.exercices.dzmitry.parkhomenka.les03_2.ex1;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		int k = 4;

		Fraction[] mas = new Fraction[k];
		inputFracion(mas, k);
		showFraction(mas);

	}

	public static void inputFracion(Fraction[] mas, int k) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {

			Fraction drob = new Fraction();
			System.out.println("Enter numerator for " + i + " fraction");
			drob.setM(sc.nextInt());
			System.out.println("Enter denominator for " + i + " fraction");
			drob.setN(sc.nextInt());

			mas[i] = drob;
		}
	}

	public static void showFraction(Fraction[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i].getM() + "/" + mas[i].getN() + " ");
		}
	}
}
