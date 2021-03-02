package chapter04kendiDenemelerim;

public class SubstringExample {
    public static void main(String[] args) {
        String str1 = "Merhaba Java";
        String str2 = str1.substring(6);
        System.out.println(str2);

        String str3 = str1.replace("haba", "gurkan");
        System.out.println(str3);

        String message = "I keep on hoping we will eat cake by the";
        message = message.substring(0,10) + " ocean!";
        System.out.println(message);
    }
}
