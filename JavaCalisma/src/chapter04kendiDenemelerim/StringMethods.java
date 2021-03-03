package chapter04kendiDenemelerim;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Banana Pineapple Kiwi Orange";
        String str4 = "Banana";
        String str5 = "banana";
        char str2 = str1.charAt(7);
        System.out.println(str2);
        String str3 = str1.toUpperCase();
        System.out.println(str3);

        int i = 5;
        int j = 6;

        System.out.println("Hello" + i + j);
        System.out.println("Hello" + (i + j));

        boolean b = str4.equalsIgnoreCase(str5);
        System.out.println(b);

    }
}
