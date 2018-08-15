package by.exercices.dzmitry.parkhomenka.l1_7;

import java.util.*;

public class ThreeChoices {
	public static void main(String[] args) {
		int a, b;
		int sum;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a: ");
		while (!sc.hasNextInt()) {
			System.out.println("Enter a number, please");
			sc.next();
		}
		a = sc.nextInt();

		System.out.println("Enter b: ");
		while (!sc.hasNextInt()) {
			System.out.println("Enter a number, please");
			sc.next();
		}
		b = sc.nextInt();
		
		if (a > b ) {
			int c;
			System.out.println("Enter c: ");
			while(!sc.hasNextInt()) {
				System.out.println("Enter a number please");
				sc.next();
			}
			c = sc.nextInt();
			
			sum = b + c;
			
			System.out.println("b and c sum equals " + sum);
		} else if (a < b){
			int c;
			System.out.println("Enter c: ");
			while(!sc.hasNextInt()) {
				System.out.println("Enter a number please");
				sc.next();	
			}
			c = sc.nextInt();
			
			sum = a + b + c;
			
			System.out.println("a and b and c sum equals " + sum + " Happy New Year!");
		} else {
			System.out.println("End");
		}
	}
}
