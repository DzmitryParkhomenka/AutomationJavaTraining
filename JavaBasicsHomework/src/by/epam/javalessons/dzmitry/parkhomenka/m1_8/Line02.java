package by.epam.javalessons.dzmitry.parkhomenka.m1_8;

import java.util.*;

public class Line02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, C = 0, D = 0;
		int count = 0;

		System.out.println("Enter A: ");
		if (sc.hasNextInt()) {
			A = sc.nextInt();
		}
		System.out.println("Enter B: ");
		if (sc.hasNextInt()) {
			B = sc.nextInt();
		}
		System.out.println("Enter C: ");
		if (sc.hasNextInt()) {
			C = sc.nextInt();
		}
		System.out.println("Enter D: ");
		if (sc.hasNextInt()) {
			D = sc.nextInt();
		}
		
		if (A % 2 == 0) {
			count++;
		}
		
		if (B % 2 == 0) {
			count++;
		}
		
		if (C % 2 == 0) {
			count++;
		}
		
		if (D % 2 == 0) {
			count++;
		}
		
		if (count >= 2) {
			System.out.println("Sequence has 2 or more even numbers.");
		} else if (count == 1) {
			System.out.println("Sequence has 1 even number.");
		} else {
			System.out.println("Sequence hasn't got any even numbers.");
		}
	}
}
