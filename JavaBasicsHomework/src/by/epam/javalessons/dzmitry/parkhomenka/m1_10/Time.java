package by.epam.javalessons.dzmitry.parkhomenka.m1_10;

import java.util.*;

public class Time {

	public static void main(String[] args) {
		int n = 0;
		int hour, min, sec;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter what second is running now: ");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		
		if ((n > 864000) || (n < 0)) {
			System.out.println("Wrond number of seconds");
			return;
		}
		
		hour = n / 3600;
		n = n - hour * 3600;
		min = n /60;
		n = n - min * 60;
		sec = n;
		
		System.out.println("В " + n + " секундах: " + hour + " ч. " + min + " мин. " + sec + " сек. ");
	}
}
