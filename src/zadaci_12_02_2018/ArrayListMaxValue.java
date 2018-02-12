package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu
 * Integera. Metoda vraæa null ukoliko je lista null iil ukoliko lista sadrži 0
 * elemenata. public static Integer max(ArrayList<Integer> list)
 * 
 * @author Edin Korkic
 *
 */
public class ArrayListMaxValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print(" Unesite elemente niza(0 prekida unos): ");
		Integer number = input.nextInt();

		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();

		}
		
		System.out.printf(" Najeveci elemeenat u array listi %d ", max(list));
	}

	public static Integer max(ArrayList<Integer> list) {

		if (list.isEmpty() || list.size() == 0) {
			return null;

		} else {
			return Collections.max(list);
		}
	}

}
