package chapter03KendiDenemelerim;

import java.util.Scanner;

public class MathRandomIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

        int sayi1 = (int)(Math.random() * 10);
        int sayi2 = (int)(Math.random() * 10);

        int sayi3 = (int)(System.currentTimeMillis() % 10);
        int sayi4 = (int)(System.currentTimeMillis() / 7 % 10);

        System.out.println(sayi3 + " + " + sayi2 + " = ?"  );
        int toplam = scanner.nextInt();

        if (toplam == sayi3 + sayi2) {
            System.out.println("dogru cevap");
        } else {
            System.out.println("yanlis cevap");
        }



    }
}
