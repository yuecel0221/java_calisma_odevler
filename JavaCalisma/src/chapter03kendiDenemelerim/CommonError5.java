package chapter03kendiDenemelerim;

public class CommonError5 {
    public static void main(String[] args) {
        final double EPSILON = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(x == 5);

        if (Math.abs(x - 0.5) < EPSILON) {
            System.out.println(x + " is approximately 0.5");
        }
    }
}
