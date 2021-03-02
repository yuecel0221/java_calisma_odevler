package chapter04kendiDenemelerim;

public class StartsWithEndWith {
    public static void main(String[] args) {
        String str1 = "Merhaba Java";
        String str2 = "merhaba java";
        String str3 = "Welcome to Java";

        System.out.println(str1.startsWith("m")); //case sensitive, returns false
        System.out.println(str1.startsWith("M")); //return true
        System.out.println(str3.endsWith("a")); //return true
        System.out.println(str2.endsWith("A")); //return false

        System.out.println(str1.equals(str2)); //returns false
        System.out.println(str1.equalsIgnoreCase(str2)); //returns true

        System.out.println(str1.contains("Va")); //returns false
    }
}
