package by.epam.javalessons.dzmitry.parkhomenka.l1_2;

import java.util.*;

public class SumAndMul {
	public static void main(String[] args) {
		int i;
		int k;
		int sum;
		int mul;

		Scanner conin = new Scanner(System.in);
		
		System.out.println("Enter i: ");
		while(!conin.hasNextInt()) {
			System.out.println("Enter a number, please.");
			conin.next();
		}
		i = conin.nextInt();
		
		System.out.println("Enter k: ");
		while(!conin.hasNextInt()) {
			System.out.println("Enter a number, please.");
			conin.next();
		}
		k = conin.nextInt();
		
		sum = i + k;
		mul = i * k;
		System.out.println("Sum is " + sum);
		System.out.println("Mul is " + mul);
	}
}
