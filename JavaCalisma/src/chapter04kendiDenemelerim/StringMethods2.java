package chapter04kendiDenemelerim;

public class StringMethods2 {
    public static void main(String[] args) {
        String str1 = "Welcme Welcome to Java";

        //indexOf***********************
        System.out.println("1- " + str1.indexOf('W'));
        System.out.println("2- " + str1.indexOf('o'));
        System.out.println("3- " +str1.indexOf('o',10)); //o karakterden itibaren arar
        System.out.println("4-" +str1.indexOf("java"));
        System.out.println("5-" +str1.indexOf("Java"));
        System.out.println("6- " +str1.indexOf("Java",11));
        System.out.println("7- " +str1.indexOf("Java",12));
        //LastIndexOf***********************
        System.out.println(str1.lastIndexOf('W'));
        System.out.println(str1.lastIndexOf('o'));
        System.out.println(str1.lastIndexOf('o',5));
    }
}
