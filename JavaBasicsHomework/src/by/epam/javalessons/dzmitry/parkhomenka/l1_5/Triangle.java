package by.epam.javalessons.dzmitry.parkhomenka.l1_5;

//import java.Math.*;

public class Triangle {
	public static void main(String[] args) {
		double a, b; //2 kateta
		double c = 0; //gipotenuza
		double p; //perimetr
		double s; //ploshchad
		a = 10;
		b = 20;
		
		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = 0.5 * a * b;
		
		System.out.println("Perimetr = " + p + " Ploshchad = " + s);
	}
}
