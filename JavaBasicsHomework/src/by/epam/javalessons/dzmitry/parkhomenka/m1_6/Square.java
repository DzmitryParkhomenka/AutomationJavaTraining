package by.epam.javalessons.dzmitry.parkhomenka.m1_6;

public class Square {
	public static void main(String[] args) {
		double skv; // площадь квадрата
		double strKv; // сторона квадрата
		double radOkr; // радиус вписанной окружности
		double skv2; // площадь вписанного квадрата
		double x; // во сколько раз площадь вписанного квадрата меньше заданного

		skv = 25;
		strKv = Math.sqrt(skv);
		radOkr = strKv / 2;
		skv2 = 2 * radOkr * radOkr;
		x = skv / skv2;

		System.out.println("Площадь вписанного квадрата меньше в " + x + " раз");
	}
}
