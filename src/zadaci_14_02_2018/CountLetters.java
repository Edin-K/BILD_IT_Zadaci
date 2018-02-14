package zadaci_14_02_2018;

import java.util.Scanner;

/**
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi
 * header: public static int countLetters(String s). Napisati program koji pita
 * korisnika da unese neki string te mu vrati koliko taj string ima slova.
 * 
 * @author Edin Korkic
 *
 */

public class CountLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");

		String s = input.nextLine();

		input.close();

		System.out.printf(" String koji ste unijeli ima %d slova.",countLetters(s));
	}

	
		public static int countLetters(String s){

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}

		}
		return count;

	}

}


