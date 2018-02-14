package zadaci_14_02_2018;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveci
 * zajednicki prefix za ta dva stringa, ukoliko isti postoji. Na primjer,
 * ukoliko korisnik unese sljedeca dva stringa "Dobrodosli u Dubai" i
 * "Dobrodosli u Vankuver" program treba da ispiše: Najveæi zajednicki prefix za
 * dva stringa je "Dobrodosli u".
 * 
 * @author Edin Korkic
 *
 */

public class CommonPrefix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite prvi string:");

		String s1 = input.nextLine();

		System.out.print(" Unesite drugi string:");

		String s2 = input.nextLine();

		input.close();

		String prefix = commonPrefix(s1, s2);

		if (prefix != null && prefix.length() > 0) {
			System.out.printf(" Najveci zajednici prefiks za dva strina je: %s ", prefix);
		} else {
			System.out.printf(" Stringovi %s i %s nemaju zajednicki prefiks.", s1, s2);

		}
	}

	public static String commonPrefix(String s1, String s2) {

		int l = s2.length();
		int count = 0;

		if (s1.length() < s2.length()) {
			l = s1.length();
		}
		for (int i = 0; i < l; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				break;
			}
			count++;
		}
		return s1.substring(0, count);
	}
}


