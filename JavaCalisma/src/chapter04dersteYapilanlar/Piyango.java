package chapter04dersteYapilanlar;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		String piyango = (int)(Math.random() * 90) + 10 + "";
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Piayngo icin iki basamakli bir sayi tahmin ediniz: ");
		String tahmin = klavye.next();
		
		char piyangoBirlerBasamagi = piyango.charAt(1);
		char piyangoOnlarBasamagi = piyango.charAt(0);
		
		char tahminBirlerBasamagi = tahmin.charAt(1);
		char tahminOnlarBasamagi = tahmin.charAt(0);
		
		System.out.println("Piyango numarasi: " + piyango);
		
		if (piyango.equals(tahmin)) {
			System.out.println("Tebrikler bildiniz. 10000 TL kazandiniz.");
		} else if (piyangoBirlerBasamagi == tahminOnlarBasamagi 
				&& piyangoOnlarBasamagi == tahminBirlerBasamagi) {
			System.out.println("Iki rakami da tutturdunuz. 3000 TL kazandiniz.");
		} else if (piyangoBirlerBasamagi == tahminBirlerBasamagi 
				|| piyangoBirlerBasamagi == tahminOnlarBasamagi
				|| piyangoOnlarBasamagi == tahminBirlerBasamagi
				|| piyangoOnlarBasamagi == tahminOnlarBasamagi) {
			System.out.println("Bir rakam tutturdunuz. 1000 TL kazandiniz.");
		} else {
			System.out.println("Bilemediniz :(");
		}
	}

}
