package bolum04.alistirmalar;

public class B04A17 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s = "Welcome to Java"; //true
        String s3 = s1 + s2; //true
        //String s3 = s1 - s2; false
        //s1 == s2; false
        //s1 >= s2; false
        System.out.println(s1.compareTo(s2));

        int i = s1.length();

        System.out.println(i);

        //char c = s1(0); false

        //char c = s1.charAt(s1.length()); false

        //System.out.println(c);
    }
}
