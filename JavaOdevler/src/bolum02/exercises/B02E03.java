package bolum02.exercises;

import java.util.Scanner;

public class B02E03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Feet degeri giriniz: ");
		double feet = scanner.nextDouble();

		double metre = feet * (305.0 / 1000);

		System.out.println(feet + " feet " + metre + " metredir");

	}
}
