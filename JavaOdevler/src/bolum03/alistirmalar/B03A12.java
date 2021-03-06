package bolum03.alistirmalar;

public class B03A12 {
    public static void main(String[] args) {
        int count = (int) (System.currentTimeMillis() % 100);
        System.out.println(count);
        boolean newLine = (count % 10 == 0);
        System.out.println(newLine);
    }
}
