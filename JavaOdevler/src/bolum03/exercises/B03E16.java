package bolum03.exercises;

public class B03E16 {
    public static void main(String[] args) {
        int x = (int) ((Math.random()) * 101) - 50;
        int y = (int) ((Math.random()) * 201) - 100;

        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println("x coordinate is: " + x);
        System.out.println("y coordinate is: " + y);
    }
}
