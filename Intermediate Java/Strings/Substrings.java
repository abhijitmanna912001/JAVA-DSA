public class Substrings {
    public static void main(String[] args) {
        printAllSubstrings("abc");
    }

    public static void printAllSubstrings(String input) {
        int n = input.length();

        for (int startIndex = 0; startIndex < n; startIndex++) {
            for (int endIndex = startIndex + 1; endIndex <= n; endIndex++) {
                System.out.println(input.substring(startIndex, endIndex));
            }
        }
    }
}
