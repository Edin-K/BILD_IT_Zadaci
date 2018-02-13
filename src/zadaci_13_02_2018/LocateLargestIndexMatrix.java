package zadaci_13_02_2018;

import java.util.Scanner;

/**
 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda treba
 * da koristi sljedeæi header: public static int[] locateLargest(double[][] a)
 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje
 * lokaciju najveæeg elementa u nizu.
 * 
 * 
 * @author Edin Korkic
 *
 */

public class LocateLargestIndexMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[4][4];

		System.out.print(" Unesite 4x4 matrix:\n ");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}

		input.close();

		int[] index = locateLargest(matrix);

		System.out.printf("  Lokacija najveceg elementa: [%d,%d]", index[0], index[1]);
	}

	public static int[] locateLargest(double[][] a) {

		int[] index = new int[2];

		index[0] = 0;
		index[1] = 0;

		double max = 0;

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (max < a[row][col]) {
					index[0] = row;
					index[1] = col;
					max = a[row][col];

				}
			}
		}
		return index;

	}
}
