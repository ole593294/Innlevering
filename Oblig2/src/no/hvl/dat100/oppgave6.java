package no.hvl.dat100;

import static javax.swing.JOptionPane.*;



public class oppgave6 {

	public static void main(String[] args) {
		
		String tall = showInputDialog("Skriv inn et heltall");
		
		int heltall = Integer.parseInt(tall);
		
		if (heltall > 0) {
			
			int fakultet = heltall;
			
			for (int i = heltall - 1; i > 0; i--) {
				fakultet = fakultet * i;
			}
			System.out.println("Fakultet: " + fakultet);
		}
		
		else {
			System.out.println("IKKE GYLDIG"); 
		}
	}

}
