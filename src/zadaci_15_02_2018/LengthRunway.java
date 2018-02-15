package zadaci_15_02_2018;

import java.util.Scanner;

/**
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, mozemo
 * izračunati minimalnu duzinu piste potrebne da avion uzleti koristeći se
 * sljedećom formulom: dužina = v * v / 2a. Napisati program koji pita korisnika
 * da unese v u m/s i a u m/s² te ispisuje korisniku minimalnu dužinu piste.
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je
 * 514.286)
 * 
 * @author Edin Korkic
 *
 */

public class LengthRunway {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.print(" Unesite brzinu aviona: ");
		double velocity = input.nextDouble();

		System.out.print(" Unesite ubrzanje aviona: ");
		double acceleration = input.nextDouble();
		input.close();

		System.out.printf("Minimalna dužina piste: %.3f metara", lengthRunway(velocity, acceleration));
	}

	public static double lengthRunway(double v, double a) {
		return Math.pow(v, 2) / (2 * a);

	}
}
