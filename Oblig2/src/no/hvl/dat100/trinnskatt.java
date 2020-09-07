package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class trinnskatt {
	
	
	public static void main(String[] args) {
		
		String lonnTxt = showInputDialog("Skriv inn din lønn");
		
		double lonn = Double.parseDouble(lonnTxt);
		
		if (lonn >= 0 && lonn < 180000) {
			System.out.println("Ingen skatt");
		}
		
		else if (lonn >= 180000 && lonn <= 254500) {
			System.out.println("Du må betale" + " " + ((lonn / 100) * 1.9) + "Kr i skatt");
		}
		
		else if (lonn >= 254500 && lonn <= 639750) {
			System.out.println("Du må betale" + " " + ((lonn / 100) * 4.2) + "Kr i skatt");
		}
		
		else if (lonn >= 639750 && lonn <= 999550) {
			System.out.println("Du må betale" + " " + ((lonn / 100) * 13.2) + "Kr i skatt");
		}
		
		else if (lonn >= 999550) {
			System.out.println("Du må betale" + " " + ((lonn / 100) * 16.2) + "Kr i skatt");
		}

	}

}
