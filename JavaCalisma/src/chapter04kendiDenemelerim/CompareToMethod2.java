package chapter04kendiDenemelerim;

public class CompareToMethod2 {
    public static void main(String[] args) {
        String str1 = "Geeky";
        String str2 = "Geekyguy";
        int compareAmount = 0;
        int i;

        for (i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
                continue;
            } else {
                compareAmount = (int) (str1.charAt(i)) - (int) (str2.charAt(i));
            }
        }

        System.out.println(compareAmount);
    }
}
