package chapter04dersteYapilanlar;

import java.util.Scanner;

public class UcgeninAcilariniHesapla {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("Uc nokta giriniz: ");
		double x1 = klavye.nextDouble();
		double y1 = klavye.nextDouble();
		double x2 = klavye.nextDouble();
		double y2 = klavye.nextDouble();
		double x3 = klavye.nextDouble();
		double y3 = klavye.nextDouble();

		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		System.out.println("1. aci: " + Math.round(A * 100) / 100.0);
		System.out.println("2. aci: " + Math.round(B * 100) / 100.0);
		System.out.println("3. aci: " + Math.round(C * 100) / 100.0);
	}
}
