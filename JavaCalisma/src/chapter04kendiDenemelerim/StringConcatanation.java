package chapter04kendiDenemelerim;

public class StringConcatanation {
    public static void main(String[] args) {
        String s1 = "I";
        String s2 = " love chocolate";
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        String s5 = s1 + " love birthday" + " gifts";
        String s6 = "Chapter " + 4;
        String s7 = "Chapter " + (char)52;
        String s8 = "Chapter " + (1 + 2);
        String s9 = "Chapter " + 1 + 2;

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
    }
}
