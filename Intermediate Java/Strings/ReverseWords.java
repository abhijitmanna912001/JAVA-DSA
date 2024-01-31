// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
// https://leetcode.com/problems/reverse-words-in-a-string/description/
// Solved these questions using below logic

public class ReverseWords {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        // String arr[] = s.split(" ");
        // String res = "";
        StringBuilder res = new StringBuilder();

        // for (int startIndex = s.length() - 1; startIndex >= 0; startIndex--) {
        int startIndex = s.length() - 1;
        

        while (startIndex >= 0) {
            while (startIndex >= 0 && s.charAt(startIndex) == ' ') {
                startIndex--;
            }

            if (startIndex < 0) {
                break;
            }

            int endIndex = startIndex;

            while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
                startIndex--;
            }

            if (res.length() == 0) {
                // res += arr[i];
                res.append(s.substring(startIndex + 1, endIndex + 1));
            } else {
                res.append(" ");
                res.append(s.substring(startIndex + 1, endIndex + 1));
                // res += " " + arr[i];
            }
        }

        // }

        return res.toString();
    }
}
