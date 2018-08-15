package by.exercices.dzmitry.parkhomenka.les02_2.ex4;

import java.util.Scanner;

public class Exercice4 {
	public static void main(String[] args) {
		String month = null;

		month = enterMonth(month);
		checkSeason(month);
	}

	public static String enterMonth(String month) {
		System.out.println("Enter month: ");
		Scanner sc = new Scanner(System.in);
		month = sc.nextLine();
		return month;
	}

	public static void checkSeason(String month) {
		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("This is winter");
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("This is spring");
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("This is summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("This is autumn");
		} else {
			System.out.println("Month does not exist or entered with mistakes");
		}
	}
}
