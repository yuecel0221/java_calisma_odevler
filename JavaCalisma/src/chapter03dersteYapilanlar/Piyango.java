package chapter03dersteYapilanlar;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90) + 10;
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Piayngo icin iki basamakli bir sayi tahmin ediniz: ");
		int tahmin = klavye.nextInt();
		
		int piyangoBirlerBasamagi = piyango % 10;
		int piyangoOnlarBasamagi = piyango / 10;
		
		int tahminBirlerBasamagi = tahmin % 10;
		int tahminOnlarBasamagi = tahmin / 10;
		
		System.out.println("Piyango numarasi: " + piyango);
		
		if (piyango == tahmin) {
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
