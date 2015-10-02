package se.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Collections {
	public static void main(String[] args) {
		
		ArrayList <Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(new Integer(5));
		arrayList.add(new Integer(4));
		arrayList.add(new Integer(3));
		arrayList.add(new Integer(3));
		System.out.println(String.format("\nArrayList (%d): ", arrayList.size()));
		arrayList.remove(new Integer(3)); // Elimina el objeto 
		arrayList.remove(0);			  // Elimina el primer elemento

		// imprimir contenido
		arrayList.forEach(v -> System.out.print(v + " "));
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(new Integer(5));
		hashSet.add(new Integer(4));
		hashSet.add(new Integer(3));
		hashSet.add(new Integer(3));
		System.out.println(String.format("\nHashSet (%d): ", hashSet.size()));
		hashSet.remove(3);                // Elimina el objeto
		hashSet.remove(5);                // Elimina el objeto
		
		// imprimir contenido
		hashSet.forEach(v -> System.out.print(v + " "));
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("ID1", "Value1");
		hashMap.put("ID2", "Value2");
		hashMap.put("ID3", "Value3");
		hashMap.put("ID4", "Value4");
		hashMap.remove("ID2");           // Elimina el objeto
		System.out.println(String.format("\nHashMap (%d): ", hashMap.size()));
		// imprimir contenido
		hashMap.forEach((k, v) -> System.out.println(k + "=" + v));
		
		
	}
}
