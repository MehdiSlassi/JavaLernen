package de.allianz.kap06;

public class Arrays {

	public static void main(String[] args) {
		int[] bArray = new int[4];
		for (int i = 0; i < bArray.length -1;  i++) {
			bArray[i] = i*i;
			System.out.println("Der Wert der Array-komponente " + i + " ist " + bArray[i]);
		}
		
	}

}
