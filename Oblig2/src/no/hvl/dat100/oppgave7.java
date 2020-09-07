package no.hvl.dat100;

import java.util.Scanner;

public class oppgave7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i <= 10; i++); {
			System.out.print("Din poengsum er:");
			
			double poeng = input.nextInt();
			
			if (poeng >= 0 && poeng <= 39) {
				System.out.print("Din karakter er F");
			} 
			
			else if (poeng >= 40 && poeng <= 49) {
				System.out.print("Din karakter er E");
			}
			
			else if (poeng >= 50 && poeng <= 59) {
				System.out.print("Din karakter er D");
			}
			
			else if (poeng >= 60 && poeng <= 79) {
				System.out.print("Din karakter er C");
			}
			
			else if (poeng >= 80 && poeng <= 89) {
				System.out.print("Din karakter er B");
			}
			
			else if (poeng >= 90 && poeng <= 100) {
				System.out.print("Din karakter er A");
			}
			
		}
		input.close();
			
	}

}
