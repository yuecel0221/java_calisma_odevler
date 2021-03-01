package chapter04kendiDenemelerim;

public class EmptyPrintln {
    public static void main(String[] args) {
        for(int j =0; j<=127; j++) {
            System.out.printf("%4d",j );
            if ((j + 1) % 20 == 0 ) {
                System.out.println();
            }
        }
    }
}
