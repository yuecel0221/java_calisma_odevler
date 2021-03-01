package chapter04kendiDenemelerim;

public class CharGiris {
    public static void main(String[] args) {
        char ch = 'A';
        char ch4 = 65; //**** chara sayisal bir deger de atayabiliyorum
        byte b = 'a'; //numerik bir degiskene karakter atayabiliyorum
        short s = '4';
        int monkey = ch;
        char lemon = '/';
        int cherry = lemon;
        System.out.println("cherry : " + cherry );

        char ece = 57;
        System.out.println("char ece: " + ece);

        System.out.println("byte b: " + b);
        int k = 'b' ;
        int number = ch;
        int number5 = (int)'<';
        System.out.println("number5 is: " + number5);

        char ch5 = (char) 47;
        System.out.println("char5 = " + ch5);

        for (int i = 0; i <= 25; i++) {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println("");

        char ch2 = '4';
        System.out.println("ch2 = '4' degeri : " + (int)ch2);
        ch2++;
        System.out.println("ch2++ = " + (int)ch2);

        char ch3 = '7';
        System.out.println("7 karakterinin ascii karsiligi : " + (int)ch3);

    }
}
