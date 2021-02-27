package chapter03kendiDenemelerim;

import java.util.Scanner;

public class HaftaSonumuHaftaIciMiBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gun sayisi giriniz: ");
        int gunSayisi = scanner.nextInt();

        switch (gunSayisi) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlis girdi");
                break;
        }

        System.out.println("Devam etmek ister misin?");
        String cevap = scanner.next();

        switch (cevap.charAt(1)) {
            case 'v':
            case 'V':
                System.out.println("Iyi devam et o zaman");
                break;
            case 'a':
            case 'A':
                System.out.println("Sen bilirsin");
                break;
            default:
                System.out.println("Ne dedigini anlamiyorum");
                break;
        }

    }
}
