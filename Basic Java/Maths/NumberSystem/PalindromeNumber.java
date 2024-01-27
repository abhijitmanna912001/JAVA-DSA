public class PalindromeNumber {
    public static void main(String[] args) {
        palindrome(121);
    }

    public static void palindrome(int num) {
        int original = num;
        int revNum = 0;

        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        if (revNum == original) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
