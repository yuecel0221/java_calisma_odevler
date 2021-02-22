package chapter02dersteYapilanlar;

public class MatematikselIfadeyiCodaDonustur {
    public static void main(String[] args) {


        double x = 1;
        double y = 1;
        double a = 1;
        double b = 1;
        double c = 1;

        double sonuc = ((3 + 4 * x) / 5) - (10 * (y - 5) * (a + b + c) / x) + 9 * ((4 / x) + (9 + x) / y);
        System.out.println("sonuc = " + sonuc);

        System.out.println(5 / 2 * 2); // yer degistirme burda yok
        System.out.println(5 * 2 / 2); // yer degistirme burda yok


        double sonuc2 = ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c) / x)) + 9 * ((4 / x) + (9 + x) / y);
        System.out.println("sonuc2 = " + sonuc2);

    }

}