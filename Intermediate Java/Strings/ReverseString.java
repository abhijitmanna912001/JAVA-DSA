public class ReverseString {
    public static void main(String[] args) {
        reverseString("ABCD");
    }

    public static void reverseString(String input) {
        String ans = "";

        int n = input.length();
        for (int i = 0; i < n; i++) {
            ans = input.charAt(i) + ans;
        }

        System.out.println(ans);
    }

}
