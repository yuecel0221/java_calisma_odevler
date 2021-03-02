package chapter04kendiDenemelerim;

import java.util.Scanner;

public class TcGirisHatasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("TC numaranizi giriniz: ");
        String tcNo = scanner.next();

        if(tcNo.length() !=11 ) {
            System.err.println("Hatali giris yaptiniz");
            System.exit(0);
        }
    }
}
