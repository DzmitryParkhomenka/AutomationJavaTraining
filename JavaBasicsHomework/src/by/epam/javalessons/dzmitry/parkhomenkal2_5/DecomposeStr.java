package by.epam.javalessons.dzmitry.parkhomenkal2_5;

public class DecomposeStr {

	public static void main(String[] args) {
		String str1;
		String str2 = "Hello";
		String str3 = new String(", world");
		String str4 = str2 + str3;
		
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		
		String str;
		str = "hello";
		int len = str.length();
		
		System.out.println("str = " + str + "; length=" + len);
		
		String str5 = "one", str6 = "one";
		if (str5.equals(str6)) {
			System.out.println("str5=str6");
		} else {
			System.out.println("str5<>str6");
		}
		
		String str7 = "one", str8 = "one";
		if (str7 == str8) {
			System.out.println("str7=str8");
		} else {
			System.out.println("str7<>str8");
		}
		
		String str9 = new String("one"), str10 = new String("one");
		if (str9 == str10) {
			System.out.println("str9=str10");
		} else {
			System.out.println("str9<>str10");
		}
	}
}
