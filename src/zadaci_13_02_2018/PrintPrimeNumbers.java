package zadaci_13_02_2018;

import java.util.Scanner;

/**
 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa
 * sve proste brojeve u zadanom rangu. BONUS: metoda može primati i treæi
 * argument, broj brojeva za isprintati po liniji.
 * 
 * @author Edin Korkic
 *
 */

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite pocetni broj: ");
		int number1 = input.nextInt();
		
		System.out.print(" Unesite krajnji broj: ");
		int number2 = input.nextInt();
		
		System.out.print(" Unesite koliko zelite brojeva po liniji: ");
		int number3 = input.nextInt();
		
		input.close();

		print(number1,number2,number3);
	}
public static void print(int number1, int number2, int number3) {
	
	int count = 0;
	
	for (int i = number1; i < number2; i++) {
		if(isPrime(i)){
			System.out.printf(" %2d ",i);
			count++;
			if(count % number3 == 0){
				System.out.printf("\n");
				
			}
			
		}
	}
	
}
public static boolean isPrime(int n) {

	for (int i = 2; i < n; i++) {
		if (n % i == 0) {
			if (n != 0 && n != 1) {

				return false;
			}
		}
	}
	return true;
}
	
}

