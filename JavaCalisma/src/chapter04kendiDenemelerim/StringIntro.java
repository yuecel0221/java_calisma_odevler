package chapter04kendiDenemelerim;

import java.util.Locale;

public class StringIntro {
    public static void main(String[] args) {
        String yazi = "Merhaba java çok özelsin!";
        String yazi2 = " java cok guzel";

        System.out.println("yazi degiskeninin karakter sayisi: " + yazi.length());

        System.out.println("yazi degiskeninin ilk karakteri: " + yazi.charAt(0));
        //System.out.println(yazi.charAt(13)) // StringIndexOutOfBoundsException

        yazi.concat(yazi2);
        System.out.println(yazi); // bunu yazarsam eklenmis hallerini gormem

        String yazi3 = yazi.concat(yazi2);

        System.out.println("yazi3: " + yazi3);

        System.out.println(yazi + yazi2); // bu operator concat gorevi yapiyor zaten o yuzden
        //kullanilmaz

        yazi.toUpperCase();
        System.out.println(yazi.toUpperCase());

        System.out.println(yazi.toUpperCase(new Locale("tr", "TR")));

        System.out.println(yazi.indexOf('e'));

        String kaweco = "      \t\t\t\t      \n      234$#3kaweco   sport    \\      ";

        System.out.println(kaweco.trim());

        String chalk = "\rcarriage return";
        System.out.println(chalk);

        int sayi = "ece".length();
        System.out.println("ece " + sayi + " harflidir");



    }
}
