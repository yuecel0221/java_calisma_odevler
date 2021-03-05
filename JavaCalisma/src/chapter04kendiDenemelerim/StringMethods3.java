package chapter04kendiDenemelerim;

public class StringMethods3 {
    public static void main(String[] args) {
        String word = "Finding Finding A Character";

        System.out.println(word.indexOf('a'));
        System.out.println(word.indexOf('z'));
        System.out.println(word.indexOf('i',2));
        System.out.println(word.indexOf("ind"));
        System.out.println(word.indexOf("ind",2));
        System.out.println("----------");
        System.out.println(word.lastIndexOf('g'));
        System.out.println(word.lastIndexOf('g', 5));
        System.out.println(word.lastIndexOf("ing",3));
    }
}
