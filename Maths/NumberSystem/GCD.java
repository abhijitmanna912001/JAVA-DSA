// https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
// I solved using this logic

public class GCD {
    public static void main(String[] args) {
        gcd(20, 40);
    }

    public static void gcd(int num1, int num2) {
        int min = (num1 <= num2) ? num1 : num2;
        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println("GCD is: " + min);
                return;
            }
            min--;
        }
        int max = (num1 <= num2) ? num2 : num1;
        System.out.println("GCD is: " + max);
    }
}
