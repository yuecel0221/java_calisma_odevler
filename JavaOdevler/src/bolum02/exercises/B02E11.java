package bolum02.exercises;

import java.util.Scanner;

public class B02E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yilSayisi = scanner.nextInt();
        long suankiNufus = 325_932_970; // int yazamaz miydim

        long toplamSaniye = suankiNufus * 24 * 60 * 60;

        double dogum = toplamSaniye / 7.0;
        double olum = toplamSaniye / 13.0;
        double goc = toplamSaniye / 45.0;

        //double dogum = toplamSaniye / 7.0; toplamSaniye long olmasina ragmen hata vermedi
        //double olum = toplamSaniye / 13.0;
        //double goc = toplamSaniye / 45.0;

        double degisim = (dogum + goc - olum);

        suankiNufus += (int)(degisim * yilSayisi);

        System.out.println(suankiNufus);

       // 1.11 e bakilarak duzeltilecek

    }
}
