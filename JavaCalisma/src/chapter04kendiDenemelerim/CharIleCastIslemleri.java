package chapter04kendiDenemelerim;

public class CharIleCastIslemleri {
    public static void main(String[] args) {
        char ch1 = 65;
        System.out.println(ch1);

        char ch2 = 'a';
        int i1 = ch2;
        System.out.println(i1);

        //byte b = ch2; ****** error

        byte b = 'a'; // ASCII tablosu byte'a sigar

        int a = (int)'a';
        System.out.println(a);

        //byte b1 = (byte)'u\2D';


    }
}
