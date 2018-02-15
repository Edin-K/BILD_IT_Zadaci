package zadaci_15_02_2018;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
 * rasponu godina koje korisnik unese. Program pita korisnika da unese pocetnu
 * godinu, krajnju godinu te ispisuje sve godine u tom rasponu. Razmak izmedu
 * godina treba biti jedan space.
 * 
 * @author Edin Korkic
 *
 */

public class LeapYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startYear, endYear;

		System.out.print(" Unesite poèetnu godinu: ");
		startYear = input.nextInt();

		System.out.print(" Unesite krajnju  godinu: ");
		endYear = input.nextInt();
		input.close();

		leapYear(startYear, endYear);
	}

	public static void leapYear(int startYear, int endYear) {

		final int PER_LINE = 10;

		ArrayList<Integer> leapYear = new ArrayList<Integer>();
		GregorianCalendar calendar = new GregorianCalendar();

		for (int i = startYear; i <= endYear; i++) {
			if (calendar.isLeapYear(i)) {
				leapYear.add(i);
			}
		}
		int perLine = 0;
		for (Integer e : leapYear) {
			if (perLine % PER_LINE == 0) {
				System.out.printf("\n");
			}
			System.out.printf(" %2d ",e);
			perLine++;

		}
	}
}
