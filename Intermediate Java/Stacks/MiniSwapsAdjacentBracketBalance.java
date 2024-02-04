// https://www.geeksforgeeks.org/problems/minimum-swaps-for-bracket-balancing2704/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Solved this using below logic

public class MiniSwapsAdjacentBracketBalance {
    public static void main(String[] args) {

    }

    public static int minimumNumberOfSwaps(String S) {
        int open = 0, close = 0, unbalanced = 0, swaps = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '[') {
                open++;
                if (unbalanced > 0) {
                    swaps += unbalanced;
                    unbalanced--;
                }
            } else {
                close++;
                unbalanced = close - open;
            }
        }

        return swaps;
    }
}
