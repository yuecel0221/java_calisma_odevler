package chapter04kendiDenemelerim;

public class MathMethodsCeil {
    public static void main(String[] args) {
        //********CEIL********
        System.out.println("ceil 3.2 = " + Math.ceil(3.2));
        System.out.println("ceil 3.8 = " + Math.ceil(3.8));
        System.out.println("ceil -3.8 = " + Math.ceil(-3.8));
        //********FLOOR********
        System.out.println("floor 3.2 = " + Math.floor(3.2));
        System.out.println("floor -3.2 = " + Math.floor(-3.2));
        System.out.println("floor -3.8 = " + Math.floor(-3.8));
        //********RINT********
        System.out.println("rint 3.1 = " + Math.rint(3.1));
        System.out.println("rint 3.2 = " + Math.rint(3.2));
        System.out.println("rint 3.499999 = " + Math.rint(3.49999999999999999999 ));
        System.out.println("rint 3.3 = " + Math.rint(3.7));
        //********ROUND********
        System.out.println("round 3.1 = " + Math.round(3.1));
        System.out.println("round 3.2 = " + Math.round(3.2));
        System.out.println("round3.499999 = " + Math.round(3.499 ));
        System.out.println("round 3.3 = " + Math.round(3.7));

        double a = 15.34297563748;

        System.out.println("round deneme: " + Math.round(a * 100) / 100.0);

    }
}
