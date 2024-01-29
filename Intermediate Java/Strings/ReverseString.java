public class ReverseString {
    public static void main(String[] args) {
        reverseString3("ABCD");
    }

    public static void reverseString(String input) {
        String ans = "";

        int n = input.length();
        for (int i = 0; i < n; i++) {
            ans = input.charAt(i) + ans;
        }

        System.out.println(ans);
    }

    public static void reverseString2(String input) {
        StringBuilder ans = new StringBuilder(input);

        int n = input.length();
        for (int i = 0; i < n / 2; i++) {
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n - 1 - i);
            ans.setCharAt(i, lastChar);
            ans.setCharAt(n - 1 - i, firstChar);
        }

        System.out.println(ans.toString());
    }

    public static void reverseString3(String input) {
        char chArray[] = input.toCharArray();
        int n = chArray.length;

        for (int i = 0; i < n / 2; i++) {
            char firstChar = chArray[i];
            char lastChar = chArray[n - 1 - i];
            chArray[i] = lastChar;
            chArray[n - 1 - i] = firstChar;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(chArray[i]);
        }
    }

}
