package zadaci_15_02_2018;

import java.util.Scanner;

/**
 * Napisati metode sa sljedeæim headerima: public static int reverse(int number)
 * i public static boolean isPalindrome(int number). Prva metoda prima cijeli
 * broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa
 * 654.) Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije.
 * Koristite reverse metodu da implementirate isPalindrome metodu. Napišite
 * program koji pita korisnika da unese broj te mu vrati da li je broj
 * palindrome ili ne.
 * 
 * 
 * @author Edin Korkic
 *
 */

public class PrimePalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Unesite cijeli broj; ");
		number = input.nextInt();
		input.close();
		
		if(isPalindrome(number))
			System.out.println("Broj je palindrom");
		else
			System.out.println("Broj nije palindrom");             
	}
		
        public static int reverse(int number){
                              
                int reverse = 0;
                while(number != 0){
                       reverse = reverse * 10;
                       reverse = reverse + (number % 10);
                       number = number / 10;
                }
                return reverse;
        }
        
        public static boolean isPalindrome(int number){
                
                return (reverse(number) == number);
                      
                        
        }

    


}
	
