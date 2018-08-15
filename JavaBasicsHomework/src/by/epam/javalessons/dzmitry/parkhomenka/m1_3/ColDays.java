package by.epam.javalessons.dzmitry.parkhomenka.m1_3;

import java.util.*;

public class ColDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0, month = 0, col_day = 0;
		
		System.out.println("Enter a year: ");
		if (sc.hasNextInt()) {
			year = sc.nextInt();
		}
		System.out.println("Enter a month number: ");
		if (sc.hasNextInt()) {
			month = sc.nextInt();
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		}
		
		System.out.println("Number of days is - " + col_day);
	}
}
