package by.epam.javalessons.dzmitry.parkhomenka.l1_3;

import java.math.*;
import java.util.Scanner;

public class Formula {
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		} 
		
		System.out.println("Enter y: ");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		}
		
		double temp;
		temp = Math.cos(x) - x / 3;
		if (temp != 0) {
			z = x * Math.log(x) + y / temp;
		} else {
			System.out.println("Denominator equals 0");
			z = Double.NaN; 
		}
		
		System.out.println("z= " + z);
	}
}
