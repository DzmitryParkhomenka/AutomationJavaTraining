package by.exercices.dzmitry.parkhomenka.l1_6;

import java.util.*;

public class Formula {
	public static void main (String[] args) {
		double a, b, c, res;
		double x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		while(!sc.hasNextDouble()) {
			sc.next();
		}
		a = sc.nextDouble();
		
		System.out.println("Enter b: ");
		while(!sc.hasNextDouble()) {
			sc.next();
		}
		b = sc.nextDouble();
		
		System.out.println("Enter c: ");
		while(!sc.hasNextDouble()) {
			sc.next();
		}
		c = sc.nextDouble();
		
		x = a * a;
		y = (b - c) * (b - c); 
		z = Math.log(b * b + 1);
		
		res = x - y + z;
		
		System.out.println("Result of the formula is " + res);
	}
}
