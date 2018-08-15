package by.exercices.dzmitry.parkhomenka.les02_2.ex5;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		String a;
		String b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите строку a: ");
		a = sc.nextLine();
		
		System.out.println("Введите строку b: ");
		b = sc.nextLine();
		
		//оператор == сравнивает значения по ссылке
		System.out.println("Произведем сравнение в переменных a и b с помощью оператора ==");
		if (a == b) {
			System.out.println("Ссылка на a и b одна");
		} else {
			System.out.println("a и b имеют разные ссылки");
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Произведем сравнение в переменных a и b с помощью оператора equals()");
		//оператор equals() сравнивает посимвольно значения переменных
		if (a.equals(b)) {
			System.out.println("Значения в a и b равны");
		} else {
			System.out.println("Значения в a и b не равны");
		}
	}
}
