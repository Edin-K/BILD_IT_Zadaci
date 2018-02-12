package zadaci_12_02_2018;

import java.util.Scanner;

/**
 * Napisati metodu koja prima dva cijela broja kao argumente te vraæa najveæi
 * zajednièki djelilac za ta dva broja.
 * 
 * PRIMJER:
 * 
 * Unesite prvi broj: 125 Unesite drugi broj: 2525 Najveæi zajednièki djelilac
 * za brojeve 125 i 2525 je 25.
 * 
 * @author Edin Korkic
 *
 */

public class GreaterCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite prvi broj: ");
		int number1 = input.nextInt();
		
		System.out.print(" Unesite drugi broj: ");
		int number2 = input.nextInt();

		input.close();

		System.out.printf(" Najveci zajednicki djelilac za brojeve %d i %d je %d.",number1,number2, gcd(number1, number2));

	}

	public static int gcd(int number1, int number2) {

		if (number2 == 0){
			return number1;
			
		}else {
			return gcd(number2, number1 % number2);
		}
	}
}
