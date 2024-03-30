// https://www.geeksforgeeks.org/problems/reverse-digit0316/1

public class ReverseNumber {
    public long reverse_digit(long n) {
        return reverseHelper(n, 0);
    }

    public long reverseHelper(long n, long res) {
        if (n == 0)
            return res;
        return reverseHelper(n / 10, res * 10 + n % 10);
    }

    public static void main(String[] args) {

    }
}
