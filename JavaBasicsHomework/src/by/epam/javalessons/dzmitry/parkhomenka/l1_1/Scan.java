package by.epam.javalessons.dzmitry.parkhomenka.l1_1;

import java.util.*;

public class Scan {
	public static void main(String[] args) {
		int i; 
		Scanner conin = new Scanner(System.in);
		while(conin.hasNextInt()) {
			i = conin.nextInt();
			System.out.println("i="+i);
		}
	}
}
