public class VolumenLuna {
	public static void main(String[] args) {
		// Radio de la luna en km
		double radioLunaKm = 1737.4d;
		int a = 4;
		int b = 3;
		
		// Ecuación 4/3 * Pi * r ^3
		double volumen = (a/b) * Math.PI * Math.pow(radioLunaKm , 3);
		System.out.println("Volumen en km3 ~ " + volumen + " (double)" );

		// Narrowing conversion
		int volumenInt = (int) volumen;
		long volumenLong = (long) volumen;
		System.out.println("Volumen en km3 ~ " + volumenInt + " (int)" );
		System.out.println("Volumen en km3 ~ " + volumenLong + " (long)" );
		
		// Widening conversion
		double volumenDouble = (double) volumenLong;
		float volumenFloat = (float) volumenInt;
		System.out.println("Volumen en km3 ~ " + volumenDouble + " (double)" );
		System.out.println("Volumen en km3 ~ " + volumenFloat + " (float)" );		
	}
}
