package bolum02.exercises;

import java.util.Scanner;

public class B02E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paraMiktari = scanner.nextInt(); //
        double aylikFaiz = 5 / 1200.0;

        double ilkAy = paraMiktari * (1 + aylikFaiz);
        double ikinciAy = (paraMiktari + ilkAy) * (1 + aylikFaiz);
        double ucuncuAy = (paraMiktari + ikinciAy) * (1 + aylikFaiz);
        double dorduncuAy = (paraMiktari +ucuncuAy) * (1 + aylikFaiz);
        double besinciAy = (paraMiktari +dorduncuAy) * (1 + aylikFaiz);
        double altinciAy = (paraMiktari +besinciAy) * (1 + aylikFaiz);

        System.out.println(altinciAy);

    }
}
