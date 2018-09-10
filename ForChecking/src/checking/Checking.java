package checking;

import java.lang.reflect.Modifier;

public final class Checking {

	public static void main(String[] args) {
		Checking a = new Checking();
		Class obj = a.getClass();
		int mods = obj.getModifiers();
		System.out.println(mods);
		if (Modifier.isFinal(mods)) {
			System.out.println("Final");
		}
		if (Modifier.isPublic(mods)) {
			System.out.println("Public");
		}
		if (Modifier.isStatic(mods)) {
			System.out.println("Static");
		}

	}

}
