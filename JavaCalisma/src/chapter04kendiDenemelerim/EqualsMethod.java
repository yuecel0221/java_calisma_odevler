package chapter04kendiDenemelerim;

public class EqualsMethod {
    public static void main(String[] args) {
        String string1 = "Merhaba java";
        String string2 = "Merhaba java sinifi";

        boolean b = string1.equals(string2);

        if (b) {
            System.out.println("These strings are equals");
        } else {
            System.out.println("Not equals");
        }

        String string3 = "snowball";
        String string4 = "snowBall";

        boolean b2 = string3.equalsIgnoreCase(string4);
        System.out.println(b2);
    }
}
