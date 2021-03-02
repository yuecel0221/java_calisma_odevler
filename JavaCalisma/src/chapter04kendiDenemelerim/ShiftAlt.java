package chapter04kendiDenemelerim;

public class ShiftAlt {
    public static void main(String[] args) {
        System.out.println("Welcome to Java".indexOf('W'));
        System.out.println("Welcome to Java".indexOf('o'));
        System.out.println("Welcome to Java".indexOf('o', 5));
        System.out.println("Welcome to Java".indexOf("come") + "hello");
        System.out.println("Welcome to Java".indexOf("Java", 5));
        System.out.println("Welcome to Java".indexOf("java", 5));
        System.out.println("*********************************************");
        System.out.println("Welcome to Java".lastIndexOf('W'));
        System.out.println("Welcome to Java".lastIndexOf('o')); //bastan da arasam sondan da arasam donen index degeri yine de aynidir
        System.out.println("Welcome to Java".lastIndexOf('o', 5));
        System.out.println("Welcome to Java".lastIndexOf("come") + "hello");
        System.out.println("Welcome to Java".lastIndexOf("Java", 5));
        System.out.println("Welcome to Java".lastIndexOf("Java"));

    }
}
