package zadaci_14_02_2018;

import java.util.Scanner;

/**
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju
 * interesnu stopu od 5%. Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417.
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) =
 * 100.417. Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) *
 * (1 + 0.00417) = 201.252. Nakon treæeg mjeseca, vrijednost na raèunu postaje
 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji
 * pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi
 * želio znati stanje raèuna.
 * 
 * @author Edin Korkic
 *
 */

public class SavingAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite mjesecni iznos stednje: ");

		double amount = input.nextDouble();

		System.out.print(" Unesite broj mjeseci: ");

		double months = input.nextDouble();

		
		input.close();
		
		savingAccount(amount,months);

	}

	public static void savingAccount(double amount, double months) {

		double account = 0;

		for (int i = 0; i < months; i++) {

			account = (account + amount) * (1 + 0.00417);
		}
		System.out.printf(" Nakon %.0f mjeseca Vas racun iznosi: %.3f ", months, account);
	}

}
