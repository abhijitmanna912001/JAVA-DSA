// https://www.geeksforgeeks.org/problems/the-celebrity-problem/0

public class Celebrity {
    public static int celebrity(int M[][], int n) {
        int left = 0, right = n - 1;

        while (left < right) {
            if (M[left][right] == 1)
                left++;
            else
                right--;
        }

        int potentialCelebrity = left;
        for (int i = 0; i < n; i++) {
            if (i != potentialCelebrity && (M[potentialCelebrity][i] == 1 || M[i][potentialCelebrity] == 0))
                return -1;
        }

        return potentialCelebrity;
    }

    public static void main(String[] args) {

    }
}
