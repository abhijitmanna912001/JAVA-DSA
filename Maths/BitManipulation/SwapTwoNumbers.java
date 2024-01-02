// https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1
// I solved this using below logic

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swap(-5, 6);
    }

    public static void swap(int num1, int num2) {
        System.out.println("num1: " + num1 + ", num2: " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }
}
