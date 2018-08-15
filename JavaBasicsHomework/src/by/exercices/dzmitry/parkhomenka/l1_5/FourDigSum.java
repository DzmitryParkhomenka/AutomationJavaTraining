package by.exercices.dzmitry.parkhomenka.l1_5;

import java.util.*;

public class FourDigSum {
	public static void main (String[] args) {
		int a, b, c, d;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		while(!sc.hasNextInt()) {
			System.out.println("Enter a number, please.");
			sc.next();
		}
		a = sc.nextInt();
		
		System.out.println("Enter b: ");
		while(!sc.hasNextInt()) {
			System.out.println("Enter a number, please.");
			sc.next();
		}
		b = sc.nextInt();
		
		System.out.println("Enter c: ");
		while(!sc.hasNextInt()) {
			System.out.println("Enter a number, please.");
			sc.next();
		}
		c = sc.nextInt();
		
		System.out.println("Enter d: ");
		while(!sc.hasNextInt()) {
			System.out.println("Enter a number, please.");
			sc.next();
		}
		d = sc.nextInt();
		
		sum = a + b + c + d;
		
		System.out.println("Sum of four entered digits is " + sum);
	}
}
