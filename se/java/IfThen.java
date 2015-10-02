package se.java;

import java.util.ArrayList;
import java.util.Random;

public class IfThen {
	public static void main(String[] args) {
		// 1. Genera una lista de Integers aleatorios
		Random random = new Random();
		ArrayList<Integer> intList = new ArrayList<>();
	    for (int i = 0; i < 10; i++) {
	    	intList.add(random.nextInt(10));
	    }

	    // 2. imprime la lista de integers aleatorios 
	    // como referencia
	    System.out.println("ArrayList:");
	    intList.forEach(e -> System.out.print(String.format("%s ", e)));
	    
	    System.out.println("");
	    System.out.println("Comparación elemento 0 > 1");
	    // 3. Un solo if no require llaves {}
	    if (intList.get(0) > intList.get(1))
	    	System.out.println(String.format("%s > %s : %s",intList.get(0), intList.get(1), true));
	    
	    System.out.println("Comparación elemento 1 > 2");
	    // 4. Uso de if & else si requiere llaves {}
	    if (intList.get(1) > intList.get(2)){
	    	System.out.println(String.format("%s > %s : %s", intList.get(1), intList.get(2), true));
	    } else {
	    	System.out.println(String.format("%s > %s : %s", intList.get(1), intList.get(2), false));
	    }
	    
	    System.out.println("Comparación elemento 3 > 4 o 3 == 4");
	    // 5. Else puede ser seguido de otro if
	    if (intList.get(3) > intList.get(4)){
	    	System.out.println(String.format("%s > %s : %s", intList.get(3), intList.get(4), true));
	    } else if (intList.get(3) == intList.get(4)){
	    	System.out.println(String.format("%s == %s : %s", intList.get(3), intList.get(4), true));
	    } else {
	    	System.out.println(String.format("%s > %s : %s", intList.get(3), intList.get(4), false));
	    }
	    
	    System.out.println("Comparación elemento 5 > 6 y 6 > 7");
	    // 6. Ifs anidados
	    if (intList.get(5) > intList.get(6)){
	    	System.out.println(String.format("%s > %s : %s", intList.get(5), intList.get(6), true));
	    	if (intList.get(6) > intList.get(7))
	    		System.out.println(String.format("%s > %s : %s", intList.get(6), intList.get(7), true));
	    	
	    } else {
	    	System.out.println(String.format("%s > %s : %s", intList.get(3), intList.get(4), false));
	    }

	}
}
