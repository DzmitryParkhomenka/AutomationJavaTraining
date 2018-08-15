package by.epam.javalessons.dzmitry.parkhomenkal02_7;

import java.util.Scanner;

public class WithArray {

	public static void main(String[] args) {
		double[] ar = new double[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "]=>");
			ar[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		for (int i=0; i<ar.length; i++) {
			System.out.println(">arr[" + i + "]=" + ar[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<ar.length; i++) {
			System.out.println("arr[" + i + "]=" + ar[i] + "; ");
		}
		
		System.out.println();
	}
}
