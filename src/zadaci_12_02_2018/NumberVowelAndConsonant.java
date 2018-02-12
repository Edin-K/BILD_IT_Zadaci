package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka,
 * znam) Napisati program koji pita korisnika da unese string te mu ispište broj
 * samoglasnika i suglasnika u datom stringu.
 * 
 * @author Edin Korkic
 *
 */

public class NumberVowelAndConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");
		String s = input.nextLine();
		s = s.toLowerCase();
		input.close();

		System.out.printf(" Broj samoglasnika u stringu %s je: %d \n", s, numberOfVowels(s));
		System.out.printf(" Broj suglasnika u stringu %s je: %d \n", s, numberOfConsonants(s));

	}

	public static int numberOfVowels(String s) {

		int count = 0;

		List<Character> vowels = new ArrayList<Character>();
		vowels.addAll(Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u' }));

		for (int i = 0; i < s.length(); i++) {
			Character letter = s.charAt(i);
			if (vowels.contains(letter)) {
				count++;
			}
		}
		return count;

	}

	public static int numberOfConsonants(String s) {

		int count = 0;

		List<Character> consonants = new ArrayList<Character>();
		consonants.addAll(Arrays.asList(new Character[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p',
				'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' }));

		for (int i = 0; i < s.length(); i++) {
			Character letter = s.charAt(i);
			if (consonants.contains(letter)) {
				count++;
			}

		}
		return count;

	}
}
