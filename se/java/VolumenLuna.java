package se.java;

public class VolumenLuna {
	public static void main(String[] args) {
		// Radio de la luna en km
		double radioLunaKm = 1737.4;
		
		// Ecuación 4/3 * Pi * r ^3
		double volumen = (4/3) * Math.PI * Math.pow(radioLunaKm , 3);
		System.out.println(String.format("Volumen en km3 ~ %s ", volumen));
	}
}