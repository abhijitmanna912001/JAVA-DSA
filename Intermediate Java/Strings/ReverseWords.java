// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
// https://leetcode.com/problems/reverse-words-in-a-string/description/
// Solved these questions using below logic

public class ReverseWords {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        // String res = "";
        StringBuilder res = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() == 0) {
                continue;
            }

            if (res.length() == 0) {
                // res += arr[i];
                res.append(arr[i]);
            } else {
                res.append(" ");
                res.append(arr[i]);
                // res += " " + arr[i];
            }
        }

        return res.toString();
    }
}
