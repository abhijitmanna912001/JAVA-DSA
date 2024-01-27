// https://practice.geeksforgeeks.org/problems/reverse-digit0316/1
// I solved this problem using this logic

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNum(15);
    }

    static void reverseNum(int num) {

        int revNum = 0;
        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse is: " + revNum);
    }
}
