package bolum02.exercises;

import java.util.Scanner;

public class B02E10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Suyun kutlesini giriniz: ");
        double kutle = scanner.nextDouble();

        System.out.println("Ilk sicakligi giriniz: ");
        double ilkSicaklik = scanner.nextDouble();

        System.out.println("Son sicakligi giriniz: ");
        double sonSicaklik = scanner.nextDouble();

        double energy = (kutle * (sonSicaklik - ilkSicaklik)) * 4184; 

        System.out.println("Gereken enerji miktari: " + energy);
    }
}
