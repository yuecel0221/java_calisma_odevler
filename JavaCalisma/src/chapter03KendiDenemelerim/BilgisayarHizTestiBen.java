package chapter03KendiDenemelerim;

public class BilgisayarHizTestiBen {
    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(System.currentTimeMillis());
        }
    }
}
