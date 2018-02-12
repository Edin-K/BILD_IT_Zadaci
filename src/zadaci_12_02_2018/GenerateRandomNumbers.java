package zadaci_12_02_2018;

/**
 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9 te
 * ispisuje koliko se puta koji broj ponovio.
 * 
 * @author Edin Korkic
 *
 */

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int counter = 0;
		int[] array = new int[100];
		int[] count = new int[100];

		System.out.printf(" Random niz: \n");
		for (int i = 0; i < array.length; i++) {
			int num = (int) (Math.random() * 10);
			array[i] = num;
			count[num]++;
			System.out.printf(" %d ", array[i]);
			counter++;
			if (counter % NUMBER_PER_LINE == 0) {
				System.out.printf("\n");
			}

		}

		System.out.printf("\n");
		printArray(array, count);
	}

	public static void printArray(int[] array, int[] count) {

		for (int i = 0; i < array.length; i++) {
			if (count[i] != 0 && i != 0) {
				System.out.printf(i + " se pojavljuje " + count[i] + (count[i] == 1 ? " put.\n" : " puta.\n"));

			}
		}

	}

}
