package bolum04.alistirmalar;

public class B04A05 {
    public static void main(String[] args) {
        int randomNumber1 = (int) (Math.random() * 21) + 34;

        System.out.println("Between 34-55" + randomNumber1);

        int randomNumber2 = (int) (Math.random() * 1000);

        System.out.println("Between 0-999" + randomNumber2);

        double randomNumber3 = Math.random() * 50 + 5.5;

    }
}
