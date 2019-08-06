package de.allianz.kap06;

public class TestPunkt8 {

	public static void main(String[] args) {
		
		Punkt8 p1 = new Punkt8();
		p1.setX(1);
		Punkt8 p2;
		
		Punkt8 p3 = new Punkt8();
		p3.setX(2);

		p2 = p1;
		
		System.out.println("p1.x hat den Wert: " + p1.getX());
		System.out.println("p2.x hat den Wert: " + p2.getX());
		System.out.println("p3.x hat den Wert: " + p3.getX());
		
		p2 = p3;
		
		System.out.println("p1.x hat den Wert: " + p1.getX());
		System.out.println("p2.x hat den Wert: " + p2.getX());
		System.out.println("p3.x hat den Wert: " + p3.getX());
		
		p2.setX(30);
		System.out.println("p3.x hat den Wert: " + p3.getX());
		System.out.println("p3.x hat den Wert: " + p3.getX());

	}

}
