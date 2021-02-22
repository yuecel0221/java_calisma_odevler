package chapter02dersteYapilanlar;

public class SuankiSaat {
    public static void main(String[] args) {

        long toplamMiliSaniye = System.currentTimeMillis();

        long toplamSaniye = toplamMiliSaniye / 1000;
        long suankiSaniye = toplamSaniye % 60;

        long toplamDakika = toplamSaniye / 60;
        long suankiDakika = toplamDakika % 60;

        long toplamSaat = toplamDakika / 60;
        long suankiSaat = toplamSaat % 24;

        System.out.println(suankiSaat + ": " + suankiDakika + ": " + suankiSaniye);




    }
}
