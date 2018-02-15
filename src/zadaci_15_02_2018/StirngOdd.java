package zadaci_15_02_2018;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve
 * karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik
 * unese string Beijing Chicago, program vraca BiigCiao.
 * 
 * @author Edin Korkic
 *
 */

public class StirngOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = null;
		
		System.out.print(" Unesite neki string:");
		s = input.nextLine();
		input.close();
		
		printCharacter(s);
	}
		public static void printCharacter(String s){
            
            char[] ch = s.toCharArray();
            for(int i = 1; i <= s.length(); i++){
                    if(i % 2 != 0){
                            System.out.print(ch[i - 1]);
                    }
            }
    }

   

}
