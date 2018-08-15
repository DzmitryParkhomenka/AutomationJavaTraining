package by.exercices.dzmitry.parkhomenka.les02_2.ex2;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		String month = null;
		int year = 0;
		int numDays = 0;

		month = enterMonth(month);
		year = enterYear(year);
		numDays = countDays(year, numDays, month);
		showDaysNumber(numDays, month);
	}

	// метод чтения месяца из консоли в переменную month
	public static String enterMonth(String month) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month: ");
		month = sc.nextLine();
		return month;
	}

	// метод чтения месяца из консоли в переменную year
	public static int enterYear(int year) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter valid year: ");
		}
		year = sc.nextInt();
		return year;
	}

	// метод определения количества дней в месяце
	public static int countDays(int year, int numDays, String month) {
		switch (month) {
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			numDays = 31;
			break;
		case "April":
		case "June":
		case "September":
		case "November":
			numDays = 30;
			break;
		case "February":
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		}
		return numDays;
	}

	// метод вывода в консоль количества дней
	public static void showDaysNumber(int numDays, String month) {
		if (numDays != 28 && numDays != 29 && numDays != 30 && numDays != 31) {
			System.out.println("Несуществующий месяц");
		} else {
			System.out.println(month + " has " + numDays + " days");
		}
	}
}
