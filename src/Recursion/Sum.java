package Recursion;

public class Sum {
    public static  int sum(int a) {
        if (a == 1) {
            return 1;

        } else {
            return a + sum(a - 1);
        }

    }
    public static void main(String[] args) {
        int result = sum(7);
        System.out.println(result);
    }
}
