package chapter03dersteYapilanlar;

import java.util.Scanner;

public class VKI {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Agirliginizi kg cinsinden giriniz: ");
		double agirlik = klavye.nextDouble();

		System.out.println("Boyunuzu metre cinsinden giriniz: ");
		double boy = klavye.nextDouble();

		double vki = agirlik / (boy * boy);

		System.out.println("vki: " + vki);

		if (vki < 18.5) {
			System.out.println("Cok zayif");
		} else if (vki < 25) {
			System.out.println("Normal");
		} else if (vki < 30) {
			System.out.println("Kilolu");
		} else {
			System.out.println("Obez");
		}
	}
}
