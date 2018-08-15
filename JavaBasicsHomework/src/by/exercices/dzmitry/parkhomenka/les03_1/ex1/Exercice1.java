package by.exercices.dzmitry.parkhomenka.les03_1.ex1;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		int N = 0;
		int K = 0;
		int sum = 0;

		N = enterArrayLength(N);
		int[] A = new int[N];
		fillArray(A);
		K = enterMultiple(K);
		sum = findKrElements(A, K, sum);
		showKrSum(sum, K);
	}

	public static int enterArrayLength(int N) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		N = sc.nextInt();
		return N;
	}

	public static void fillArray(int[] A) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < A.length; i++) {
			System.out.print("A[" + i + "]=>");
			A[i] = sc.nextInt();
		}
	}

	public static int enterMultiple(int K) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter K multiple: ");
		K = sc.nextInt();
		return K;
	}

	public static int findKrElements(int[] A, int K, int sum) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] % K == 0) {
				sum = sum + A[i];
			}

		}
		return sum;

	}

	public static void showKrSum(int sum, int K) {
		System.out.println("Sum of numbers that multiple " + K + " is - " + sum);
	}
}
