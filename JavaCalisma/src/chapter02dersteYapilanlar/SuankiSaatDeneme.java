package chapter02dersteYapilanlar;

public class SuankiSaatDeneme {
    public static void main(String[] args) {

        long toplamMilisaniye = System.currentTimeMillis();

        long toplamSaniye = toplamMilisaniye / 1000;
        long suankiSaniye = toplamSaniye % 60;

        long toplamDakika = toplamSaniye / 60;
        long suankiDakika = toplamDakika % 60;

        long etrtt = toplamDakika / 60;
        long suankiSaat = etrtt % 24;

        System.out.println(suankiSaat + " : " + suankiDakika + " : " + suankiSaniye + " GMT");
    }
}
