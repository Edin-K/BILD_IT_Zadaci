package zadaci_14_02_2018;

/**
 * Napisati program koji simulira nasumicno izvlacenje karte iz spila od 52
 * karte. Program treba ispisati koja karta je izvucena (A, 2, 3, 4, 5, 6, 7, 8,
 * 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik, Djetelina,
 * Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 * 
 * @author Edin Korkic
 *
 */

public class RandomCards {

	public static void main(String[] args) {

		int[] deck = new int[52];

		String[] suits = { "srce", "pik", "djetelina", "kocka" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		randomCards(deck,suits,ranks);

	}

	public static void randomCards(int[] deck, String[] suits, String[] ranks) {

		for (int i = 0; i < deck.length; i++)
			deck[i] = i;

		for (int i = 0; i < deck.length;) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.printf(" Karta koju ste izvukli je %s u znaku %s.", rank, suit);
			break;
		}

	}
}
