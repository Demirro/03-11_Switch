package de.uk.java;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		// Der Code soll ab hier nicht angerührt werden
		// Scanner erstellen
		Scanner scanner = new Scanner(System.in);
		
		// Konsolenausgabe - Aufruf zur Eingabe
		System.out.println("ANGEBOTE");
		System.out.println("Überprüfe ob ein eingegebenes Produkt im Angebot ist:");
		
		// Eingabe lesen und als Variable speichern
		String artikel = scanner.nextLine();
		
		// Methode aufrufen. gespeicherte Eingabe wird mitgegeben
		checkDeals(artikel);
		
		// Scanner schließen
		scanner.close();
		
		// Bis hier soll der Code nicht angerührt werden
	}

	static void checkDeals(String artikel) {

	}

}
