package by.epam.javalessons.dzmitry.parkhomenka.l1_4;

import java.util.*;

public class MinMaxString {
	public static void main(String[] args) {
		int n = 10;
		Scanner sc = new Scanner(System.in);
		String min = "";
		String max = "";
		String str = "";
		for (int i = 0; i < n; i++) {
			System.out.print("Enter symbols 10 times -->" + i);
			if (sc.hasNextLine()) {
				str = sc.nextLine();
				if (i == 0) {
					min = str;
				}
				if (str.length() > max.length()) {
					max = str;
				} else if (str.length() < min.length()) {
					min = str;
				}
			}
		}
		System.out.println("Max string = " + max + " length=" + max.length());
		System.out.println("Min string = " + min + " length=" + min.length());
	}
}
