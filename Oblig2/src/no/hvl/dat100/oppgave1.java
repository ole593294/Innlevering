package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class oppgave1 {
	
  public static void main(String[] args) {
    String tall = showInputDialog("Skriv inn pris: ");
    int pris = Integer.parseInt(tall);

    String tall1 = showInputDialog("Skriv inn belop: ");
    int belop = Integer.parseInt(tall1);

    int diff = belop - pris;

    if (diff > 0) {
      int enere = diff % 10;
      int tiere = (diff - enere) / 10;
      System.out.println("ENERE: " + enere + " TIERE: " + tiere);
    }
  }
}