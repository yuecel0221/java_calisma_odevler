package bolum02.exercises;

import java.util.Scanner;

public class B02E08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Time zone u giriniz: ");
		int gmt = scanner.nextInt();

		long toplamMiliSaniye = System.currentTimeMillis();

		long toplamSaniye = toplamMiliSaniye / 1000;

		long toplamDakika = toplamSaniye / 60;

		int suankiSaniye = (int) (toplamSaniye % 60);

		long toplamSaat = toplamDakika / 60;

		int suankiDakika = (int) (toplamDakika % 60);

		int suankiSaat = (int) ((toplamSaat + gmt) % 24);

		System.out.println(suankiSaat + " : " + suankiDakika + " : " + suankiSaniye);

	}
}
