package chapter03dersteYapilanlar;
import java.util.Scanner;

public class ToplamaArasinavi {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		*/
		// 0 <= Math.random() < 1
		//int sayi1 = (int)(Math.random() * 10);
		//int sayi2 = (int)(Math.random() * 10);
		
		int sayi1 = (int)(System.currentTimeMillis() % 10);
		int sayi2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		System.out.println(sayi1 + " + " + sayi2 + " = ?" );
		
		Scanner klavye = new Scanner(System.in);
		
		int toplam = klavye.nextInt();
		
		if (sayi1 + sayi2 == toplam) {
			System.out.println("Doğru cevap");
		} else {
			System.out.println("Yanlış cevap");
		}
		
		
	}

}
