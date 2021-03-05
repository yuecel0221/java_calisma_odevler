package chapter04kendiDenemelerim;

public class SubstringAndReplaceExample {
    public static void main(String[] args) {
        String str1 = "Merhaba Java";
        String str2 = str1.substring(8); //nerden baslatirsam ordan baslar
        System.out.println(str2);

        String message = "I keep on hoping we will eat cake by the";
        message = message.substring(0,10) + "ocean!";
        System.out.println(message);

        String str3 = str1.replace("haba", "gurkan");
        System.out.println(str3);


    }
}
