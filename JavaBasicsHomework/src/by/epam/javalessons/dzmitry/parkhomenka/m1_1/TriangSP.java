package by.epam.javalessons.dzmitry.parkhomenka.m1_1;

import java.util.*;

public class TriangSP {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   double x1=0, y1=0, x2=0, y2=0, x3=0, y3=0;
	   
	   double a, b, c;
	   double P, S;
	   double p;
	   
	   System.out.print("Enter x1: ");
	   if (sc.hasNextDouble()) {
		   x1 = sc.nextDouble();
	   }
	   
	   System.out.print("Enter y1: ");
	   if (sc.hasNextDouble()) {
		   y1 = sc.nextDouble();
	   }
	   
	   System.out.print("Enter x2: ");
	   if (sc.hasNextDouble()) {
		   x2 = sc.nextDouble();
	   }
	   
	   System.out.print("Enter y2: ");
	   if (sc.hasNextDouble()) {
		   y2 = sc.nextDouble();
	   }
	   
	   System.out.print("Enter x3: ");
	   if (sc.hasNextDouble()) {
		   x3 = sc.nextDouble();
	   }
	   
	   System.out.print("Enter y3: ");
	   if (sc.hasNextDouble()) {
		   y3 = sc.nextDouble();
	   }
	   
	   a = Math.sqrt(Math.pow(Math.abs(Math.abs(x1) - Math.abs(x3)), 2) + Math.pow(Math.abs(Math.abs(y1) - Math.abs(y3)), 2));
	   b = Math.sqrt(Math.pow(Math.abs(Math.abs(x3) - Math.abs(x2)), 2) + Math.pow(Math.abs(Math.abs(y3) - Math.abs(y2)), 2));
	   c = Math.sqrt(Math.pow(Math.abs(Math.abs(x1) - Math.abs(x2)), 2) + Math.pow(Math.abs(Math.abs(y1) - Math.abs(y2)), 2));
	   
	   P = a + b + c;
	   p = P / 2;
	   S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	   
	   System.out.println(a + " " + b + " " + c);
	   System.out.println("Периметр треугольника равен Р=" + P + ", площадь S=" + S);
	}
}
