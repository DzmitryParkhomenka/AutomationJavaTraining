package by.exercices.dzmitry.parkhomenka.l2_1;

import java.util.*;

public class Lesson02_1 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		
		System.out.println("Enter b: ");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}
		
		if (a == b) {
			System.out.println("Скоро новый год");
		} else {
			int c = 0;
			double sum, kv;
			
			System.out.println("Enter c: ");
			if (sc.hasNextInt()) {
				c = sc.nextInt();
			}
			
			sum = a + b + c;
			kv = Math.pow(a, 2) + Math.pow(b, 2);
			
			System.out.println(sum);
			System.out.println(kv);
			System.out.println("моя любимая футбольная команда");
		}
	}
}
