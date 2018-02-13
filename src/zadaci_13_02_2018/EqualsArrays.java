package zadaci_13_02_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na
 * istim pozicijama jednaki. Napisati metodu koja vraæa true ukoliko su nizovi
 * niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
 * public static boolean equals(int[] niz1, int[] niz2)
 * Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva
 * te provjerava da li su striktno identièni.
 * 
 * @author Edin Korkic
 *
 */

public class EqualsArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		System.out.print(" Unesite prvi niz: ");
		for(int i = 0; i < array1.length; i++){
			array1[i] = input.nextInt();
		}
		
		System.out.print(" Unesite drugi niz: ");
		for(int i = 0; i < array2.length; i++){
			array2[i] = input.nextInt();
		}
		
		input.close();
		
		System.out.printf(" Nizovi array1 i array2" + (equals(array1,array2)?" su strikto ":" nisu striktno ") + "indeticni!");

	}
	 public static boolean equals(int[] array1, int[] array2){
		
		 return Arrays.equals(array1, array2);
		 
		 
	 }

}
