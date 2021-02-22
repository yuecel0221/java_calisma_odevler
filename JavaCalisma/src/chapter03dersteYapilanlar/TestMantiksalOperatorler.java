package chapter03dersteYapilanlar;

import java.util.Scanner;

public class TestMantiksalOperatorler {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
		
		int sayi = klavye.nextInt();
		
		if (sayi % 2 == 0 && sayi % 3 == 0) {
			System.out.println("Girdiginiz sayi 2 ve 3 tam bolunuyor.");
		}
		
		if (sayi % 2 == 0 || sayi % 3 == 0) {
			System.out.println("Girdiginiz sayi 2 veya 3 e bolunuyor");
		}
		
		if (sayi % 2 == 0 ^ sayi % 3 == 0) {
			System.out.println("Girdiginiz sayi 2 veya 3 e bolunuyor ancak her ikisine birden bolunmuyor");
		}
	}
}
