// https://www.geeksforgeeks.org/problems/palindrome-string0817/1?page=1&category=Strings&sortBy=submissions
// Solved this question using below logic

public class PalindromeString {
    public static void main(String[] args) {
        boolean res = checkPalindrome("NAMAN");
        System.out.println(res);
    }

    public static boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
