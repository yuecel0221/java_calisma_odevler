package bolum04.alistirmalar;

public class B04A16 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s2));
        System.out.println(s2.compareTo(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf("to"));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf("o", 19));
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 11));
        System.out.println(s1.startsWith("Wel"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));
        System.out.println("\t Wel \t".trim());
    }
}
