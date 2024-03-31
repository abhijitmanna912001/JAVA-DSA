public class ReverseString {
    public static String reverseWord(String str) {
        return printRev(str, 0, "");
    }

    public static String printRev(String input, int index, String reversed) {
        if (index == input.length()) {
            return reversed;
        }
        reversed = input.charAt(index) + reversed;
        return printRev(input, index + 1, reversed);
    }

    public static void main(String[] args) {

    }
}
