package chapter02dersteYapilanlar;

public class MathPowerOrnegi {
    public static void main(String[] args) {
        double ust = Math.pow(-2,4);
        //System.out.println("2 ustu 8 = " + ust); // bu haliyle sonda nokta verir, nokta olmamasi icin yazdirirken inte cast ederim
        System.out.println("2 ustu 8 = " + (int)ust);

        int ust2 = (int)Math.pow(3,4);
        System.out.println("3 uzeri 4 = " + ust2);

        int karekok = (int)Math.pow(4,0.5);
        System.out.println("Karekok 4 = " + karekok);
    }
}
