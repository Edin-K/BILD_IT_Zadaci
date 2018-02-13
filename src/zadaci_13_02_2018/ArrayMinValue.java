package zadaci_13_02_2018;

import java.util.Scanner;

/**
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti
 * koristeæi se sljedeæim headerom: public static double min(double[] array)
 * Napišite potom test program koji pita korisnika da unese deset brojeva te
 * poziva ovu metodu da vrati najmanji element u nizu.
 * 
 * @author Edin Korkic
 *
 */

public class ArrayMinValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" Unesite niz od deset elemenata: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}

		input.close();

		System.out.printf(" Najmanji element u nizu je: %.2f ", min(array));
	}

	public static double min(double[] array) {

		double min = array[0];

		for (double i : array) {
			if (i < min) {
				min = i;
			}

		}
		return min;
	}
}
