package chapter03dersteYapilanlar;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir yil giriniz: ");
		int yil = klavye.nextInt();
		
		boolean artikYilMi = yil % 4 == 0;
		
		artikYilMi = artikYilMi && yil % 100 != 0;
		
		artikYilMi = artikYilMi || yil % 400 == 0;
		
		// Yukaridakiyle ayni 
		artikYilMi = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
		
		if (artikYilMi) {
			System.out.println(yil + " artik yildir");
		} else {
			System.out.println(yil + " artik yil degildir");
		}
	}

}
