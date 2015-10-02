package se.java;

public class Comparacion {
	public static void main(String[] args) {
		// Creando Strings con literales y constructor
		String a = "Java SE 8";
		String b = "Java SE 8";
		String c = new String("Java SE 8");
		String d = c.intern();

		// Comparando Strings
		System.out.println(String.format("a==b       : %s", a == b));
		System.out.println(String.format("b==c       : %s", b == c));
		System.out.println(String.format("c==a       : %s", c == a));
		System.out.println(String.format("d==a       : %s", d == a));
		System.out.println(String.format("c.equals(a): %s", c.equals(a)));
	}
}
