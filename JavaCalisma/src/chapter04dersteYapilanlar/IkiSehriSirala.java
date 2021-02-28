package chapter04dersteYapilanlar;

import java.util.Scanner;

public class IkiSehriSirala {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir sehir giriniz");
		String sehir1 = klavye.next();
		
		System.out.println("Bir sehir daha giriniz");
		String sehir2 = klavye.next();
		
		if (sehir1.compareToIgnoreCase(sehir2) < 0) {
			System.out.println("Sehirleri sirali sekilde yazdiriyoruz: " + sehir1 + " " + sehir2);
		} else {
			System.out.println("Sehirleri sirali sekilde yazdiriyoruz: " + sehir2 + " " + sehir1);
		}
	}

}
