package zadaci_13_02_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementirati sljedeæu metodu da sortira redove u 2D nizu. public static
 * double[][] sortRows(double[][] array) Napisati testni program koji pita
 * korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu želi
 * unijeti) te mu ispisuje na konzoli matricu sa sortiranim redovima - od
 * najmanjeg broja do najveæeg.
 * 
 * 
 * @author Edin Korkic
 *
 */

public class SortRowsMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] array = new double[4][4];

		System.out.print(" Unesite 4x4 matrix:\n ");

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = input.nextDouble();
			}
		}

		input.close();

		double[][] matrix = sortRows(array);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf(" %2.2f ", matrix[row][col]);
			}
			System.out.printf("\n");
		}
	}

	public static double[][] sortRows(double[][] array) {

		double[][] matrix = new double[array.length][array[0].length];
		System.arraycopy(array, 0, matrix, 0, array.length);

		for (int row = 0; row < array.length; row++) {
			Arrays.sort(matrix[row]);
		}

		return matrix;

	}
}
