package by.exercices.dzmitry.parkhomenka.l2_2;

import java.util.*;

public class Lesson02_2 {

	public static void main(String[] args) {
		int a = 0, ch = 0, kr = 0, md = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many digits to enter?");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		
		int[] c = new int[a];
		
		System.out.println("Enter " + a + " digits");
		for (int i = 0; i < a; i++) {
			System.out.print("> ");
			if (sc.hasNextInt()) {
				c[i] = sc.nextInt();
			}
			
			if (c[i] % 2 == 0) {
				ch++;
			}
			
			if (c[i] % 3 == 0) {
				kr++;
			}
			
			if (Math.abs(c[i]) < 3) {
				md++;
			}
		}
		
		System.out.println("Четных - " + ch + ", делятся на 3 - " + kr + ", модуль меньше 3 у - " + md + " чисел.");
	}
}
