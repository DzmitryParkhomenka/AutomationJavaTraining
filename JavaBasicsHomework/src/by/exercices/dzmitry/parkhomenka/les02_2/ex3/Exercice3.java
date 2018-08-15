package by.exercices.dzmitry.parkhomenka.les02_2.ex3;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		String monthName = null;
		Month month;

		month = inputMonthName(monthName);
		Season(month);

	}

	public static Month inputMonthName(String monthName) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month: ");
		monthName = sc.nextLine().toUpperCase();
		Month month = Month.valueOf(monthName);
		return month;
	}

	public static Month Season(Month month) {
		switch (month) {
		case DECEMBER:
		case JANUARY:
		case FEBRUARY:
			System.out.println("Winter");
			break;

		case MARCH:
		case APRIL:
		case MAY:
			System.out.println("Spring");
			break;

		case JUNE:
		case JULY:
		case AUGUST:
			System.out.println("Summer");
			break;

		case SEPTEMBER:
		case OCTOBER:
		case NOVEMBER:
			System.out.println("Autumn");
			break;
		}
		return month;
	}

	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

}
