package de.allianz.kap06;

public class Arrays {

	public static void main(String[] args) {
		
		int x = 1;
		int[] bArray = new int[4];
		for (int i = 0; i < bArray.length;  i++) {
			bArray[i] = i*i;
			System.out.println("Der Wert der Array-komponente " + i + " ist " + bArray[i]);
		}
		
		int[] bArray1 = {x, x+x, 2*x, 3*x};
		
		System.out.println("Der Wert der Array-komponente 2  ist " + bArray1[1]);
	}

}
