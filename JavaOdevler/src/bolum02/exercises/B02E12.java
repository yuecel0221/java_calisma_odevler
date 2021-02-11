package bolum02.exercises;

import java.util.Scanner;

public class B02E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inis hizini giriniz: ");
        double hiz = scanner.nextDouble();

        System.out.println("Ivmeyi giriniz: ");
        double ivme = scanner.nextDouble();

        double mesafe = (hiz * hiz) / (2 * ivme);
        System.out.println(mesafe);
    }
}
