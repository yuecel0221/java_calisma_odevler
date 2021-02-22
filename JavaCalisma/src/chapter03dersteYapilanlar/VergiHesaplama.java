package chapter03dersteYapilanlar;

import java.util.Scanner;

public class VergiHesaplama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Yillik toplam gelirinizi giriniz: ");
		double gelir = klavye.nextDouble();
		double vergi;
		
		if (gelir <= 12600) {
			vergi = gelir * 0.15;
		} else if (gelir <= 30000) {
			vergi = 12600 * 0.15 + (gelir - 12600) * 0.20;
		} else if (gelir <= 69000) {
			vergi = 12600 * 0.15 + (30000 - 12600) * 0.20 + (gelir - 30000) * 0.27;
		} else {
			vergi = 12600 * 0.15 + (30000 - 12600) * 0.20 + (69000 - 30000) * 0.27 + (gelir - 69000) * 0.35;
		}
		System.out.println("yillik verginiz: " + vergi);
	}

}
