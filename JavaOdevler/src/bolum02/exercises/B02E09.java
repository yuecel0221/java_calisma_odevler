package bolum02.exercises;

import java.util.Scanner;

public class B02E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilk hizi giriniz: ");
        double ilkHiz = scanner.nextDouble();

        System.out.println("Son hizi giriniz: ");
        double sonHiz = scanner.nextDouble();

        System.out.println("Sureyi saniye cinsinden giriniz: ");
        double saniye = scanner.nextDouble();

        double ivme = (sonHiz - ilkHiz) / saniye;
        double ivmeSon = (int)(ivme * 100) / 100.0;


        System.out.println(ivmeSon);
    }
}
