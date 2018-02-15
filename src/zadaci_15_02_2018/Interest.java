package zadaci_15_02_2018;

import java.util.Scanner;

/**
 * Napisati program koji ucitava iznos investicije, godisnju interesnu stopu i
 * broj godina te vraca buducu vrijednost investicije koristeci se sljedecom
 * formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 +
 * mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko uneste kao iznos
 * investicije 1000, 3.25 kao godisnju interesnu stopu i 1 kao broj godina
 * program vam vraca 1032.98 kao buducu vrijednost investicije.
 * 
 * @author Edin Korkic
 *
 */

public class Interest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite iznos investicije:");
		double investment = input.nextDouble();

		System.out.print(" Unesite godisnju interesnu stopu:");
		double interest = input.nextDouble();

		System.out.print(" Unesite broj godina:");
		double numberOfYears = input.nextDouble();

		interest /= 1200;
		input.close();
		
		interest(investment, interest, numberOfYears);

	}

	public static void interest(double investment, double interest, double numberOfYears) {

		double futureInvestment = investment * Math.pow(1 + interest, numberOfYears * 12);

		System.out.printf(" Buduca vrijednost investicije je: %.2f ", futureInvestment);

	}
}
