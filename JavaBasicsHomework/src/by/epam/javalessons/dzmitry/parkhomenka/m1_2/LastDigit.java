package by.epam.javalessons.dzmitry.parkhomenka.m1_2;

import java.util.*;

public class LastDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int poslCifra;
		int poslCifraKv;
		
		System.out.println("Enter a number: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		
		poslCifra = number % 10;
		switch (poslCifra) {
		case 0:
			poslCifraKv = 0;
			break;
		case 1:
			poslCifraKv = 1;
			break;
		case 2:
			poslCifraKv = 4;
			break;
		case 3:
			poslCifraKv = 9;
			break;
		case 4:
			poslCifraKv = 6;
			break;
		case 5:
			poslCifraKv = 5;
			break;
		case 6:
			poslCifraKv = 6;
			break;
		case 7:
			poslCifraKv = 9;
			break;
		case 8:
			poslCifraKv = 4;
			break;
		case 9:
			poslCifraKv = 1;
			break;
		default:
			System.out.println("Something wrong with the program. We are working to fix the problem.");
			return;
		}
		System.out.println("Kvadrat chisla " + number + " ravnyaetsa " + poslCifraKv);
	}
}
