// https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
// I solved using below logic

public class ArmStrongNumber {
    public static void main(String[] args) {
        armStrongNumber(153);
    }

    public static void armStrongNumber(int num) {
        int res = 0;
        int copy = num;
        while (num > 0) {
            int digit = num % 10;
            res = res + (int) Math.pow(digit, 3);
            num /= 10;
        }
        System.out.println(res == copy);
    }
}
