package chapter04sorularim;

public class LastIndexOf {
    public static void main(String[] args) {

        String word = "Finding Finding A Character";

        System.out.println(word.lastIndexOf("ing", 3));
        System.out.println(word.lastIndexOf("ind", 1));
        System.out.println(word.lastIndexOf("i",50)); // bound hatasi vermiyor

        // Aranan tum stringin o indexten itibaren icinde olmasina gerek yok diye anliyorum bu kodu calistirinca
    }
}
