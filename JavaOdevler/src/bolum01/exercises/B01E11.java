package bolum01.exercises;

public class B01E11 {
    public static void main(String[] args) {
        System.out.println("population1: " + (312032486 + (365 * 24 * 3600 / 7.0) + (365 * 24 * 3600 / 45.0) - (365 * 24 * 3600 / 13.0)));
        System.out.println("population2: " + 312032486 + 2 * ((365 * 24 * 3600 / 7.0) + (365 * 24 * 3600 / 45.0) - (365 * 24 * 3600 / 13.0)));
        System.out.println("population3: " + 312032486 + 3 * ((365 * 24 * 3600 / 7.0) + (365 * 24 * 3600 / 45.0) - (365 * 24 * 3600 / 13.0)));
        System.out.println("population4: " + 312032486 + 4 * ((365 * 24 * 3600 / 7.0) + (365 * 24 * 3600 / 45.0) - (365 * 24 * 3600 / 13.0)));
        System.out.println("population5: " + 312032486 + 5 * ((365 * 24 * 3600 / 7.0) + (365 * 24 * 3600 / 45.0) - (365 * 24 * 3600 / 13.0)));
    }
}
