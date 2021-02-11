package bolum02.exercises;

import java.util.Scanner;

public class B02E07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		long dakika = scanner.nextLong();

		long saat = dakika / 60;
		long gun = saat / 24;
		long yil = gun / 365;
		int kalanGun = (int) (gun % 365);

		System.out.println(dakika + " minutes is approximately " + yil + " years and " + kalanGun + " days");
	}
}
