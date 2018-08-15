package by.epam.javalessons.dzmitry.parkhomenka.m1_5;

public class FindNOD {

	public static void main(String[] args) {
		int a, b, nod = 0;
		a = 20;
		b = 16;
		nod = NOD(a, b);
		System.out.println("NOD(" + a + "," + b + ")=" + nod);
	}
	
	public static int NOD(int x, int y) {
		int nod = 0;
		if (x > y) {
			nod = y;
		} else {
			nod = x;
		}
		
		while (!(x % nod == 0) && (y % nod == 0)) {
			nod--;
		}
		return nod;
	}
}
