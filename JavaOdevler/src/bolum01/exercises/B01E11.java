package bolum01.exercises;

public class B01E11 {
    public static void main(String[] args) {
    	final int BIR_YILDAKI_SANIYE = 365 * 24 * 60 * 60;
    	double birYildakiNufusDegisimi = (BIR_YILDAKI_SANIYE / 7.0) + (BIR_YILDAKI_SANIYE / 45.0) - (BIR_YILDAKI_SANIYE / 13.0);
    	int suankiNufusu = 312032486;
    	
        System.out.println("population1: " + (int) (suankiNufusu + birYildakiNufusDegisimi));
        System.out.println("population2: " + (int) (suankiNufusu + 2 * birYildakiNufusDegisimi));
        System.out.println("population3: " + (int) (suankiNufusu + 3 * birYildakiNufusDegisimi));
        System.out.println("population4: " + (int) (suankiNufusu + 4 * birYildakiNufusDegisimi));
        System.out.println("population5: " + (int) (suankiNufusu + 5 * birYildakiNufusDegisimi));
    }
}
