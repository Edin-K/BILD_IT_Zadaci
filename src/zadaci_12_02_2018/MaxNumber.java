package zadaci_12_02_2018;

import java.util.Scanner;

/**
 * Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te ispisuje
 * koliko se puta taj broj ponavlja. Pretpostavimo da se unos brojeva završava
 * sa nulom.
 * 
 * @author Edin Korkic
 *
 */

public class MaxNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[100];
		int[] count = new int[100];

		System.out.print(" Unesite cijele brojeve izmeðu 1 i 100(0 prekida unos): ");

		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
			count[num]++;
			if (num == 0) {
				break;
			}
		}
		input.close();

		printArray(array, count);
	}

	public static void printArray(int[] array, int[] count) {

		int max = array[0];

		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0 && i != 0 && count[i] == max) {
				System.out.printf(i + " se pojavljuje " + count[i] + (count[i] == 1 ? " put.\n" : " puta.\n"));

			}
		}
	}

}
