package chapter02dersteYapilanlar;

public class Literaller {
    public static void main(String[] args) {
        byte b = 13; // buna hata vermedi

        short s = 700; // tamam integersin anladim ama shorta koyamiyorum

        int i = 2146000000;

        long derkirsche = 100;


        double d = 128;
        System.out.println("d = " + d);

        long l = 21490;
        int ece = (int)l;
        System.out.println("ece = " + ece);

        float f = 1.0F;
        int mary = (int)f;
        System.out.println("mary = " + mary);

        long l1 = 900;

        System.out.println("Bilimsel Gosterim " + 1.23456E-3); // yazacagin sayiyi yaz, E virgulun nereye konulacagini soyler + ise saga - ise sola

        int binary = 0B1111;
        System.out.println(binary);

        int hex = 0XFFFF;
        System.out.println(hex);

        float a = 1.4F;
        System.out.println(s);


    }
}
