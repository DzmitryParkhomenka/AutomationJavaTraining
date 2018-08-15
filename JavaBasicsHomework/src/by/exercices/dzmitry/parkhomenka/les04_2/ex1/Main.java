package by.exercices.dzmitry.parkhomenka.les04_2.ex1;

public class Main {

	public static void main(String[] args) {				
		Student std1 = new Student(135, 291323086, 1, "Parkhomenko", "Dmitry", "Vladimirovich",
				"29.11.1990", "Esenina 4-43", "Radiotechnics");
		
		Customer cust1 = new Customer(225, "1111-4444-7777-9999", "2-34321234312", "Ginger", "Orange", "Lemonovich",
			"Korobka Citrusovih 4-4");
		
		std1.show(std1);
		System.out.println();
		cust1.show(cust1);
		
	}
}
