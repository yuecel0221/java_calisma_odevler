package chapter03kendiDenemelerim;

public class NestedIf {
    public static void main(String[] args) {
        int i = 35;
        int j = 20;
        int k = 10;

        if(i>j) {
            if(j>k) {
                System.out.println("i and j greater than k");
            }
        } else {
            System.out.println("i is less than or equal to k");
        }
    }
}
