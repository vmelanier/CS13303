package se.java;

public class WhileDoWhile {
	public static void main(String[] args) {
		
		// 1. Ciclo while
		System.out.println("While: ");
		int i = 0;
		while(i < 20){
			System.out.print(String.format("%s ", i));
			i++;
		}
		System.out.println("");
		
		//2. Ciclo do-while
		System.out.println("DO-While: ");
		int j = 20;
		do {
			System.out.print(String.format("%s ", j));
			j--;
		} while (j > 0);
		
	}
}
