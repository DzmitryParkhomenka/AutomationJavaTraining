package by.epam.javalessons.dzmitry.parkhomenka.m1_9;

import java.util.*;

public class Line03 {

	public static void main(String[] args) {
		int number = 0;
		int sumDigitNumber = 0;
		int kv_number;
		int kub_number;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		
		kv_number = number * number;
		
		while (number % 10 != 0) {
			sumDigitNumber += number % 10;
			number = number / 10;
		}
		sumDigitNumber += number;
		kub_number = (int)  Math.pow(sumDigitNumber, 3);
		
		if (kub_number == kv_number) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
