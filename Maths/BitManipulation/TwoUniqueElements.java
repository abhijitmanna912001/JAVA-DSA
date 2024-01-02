// https://www.geeksforgeeks.org/problems/finding-the-numbers0215/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// https://leetcode.com/problems/single-number-iii/description/
// Solved both these questions using below logic

public class TwoUniqueElements {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 6, 3, 3, 1, 1 };
        printTwoUniqueElements(arr);
    }

    public static void printTwoUniqueElements(int arr[]) {
        int l = arr.length;
        int res = 0;

        for (int i = 0; i < l; i++) {
            res = res ^ arr[i];
        }

        int setBit = 0;
        int bit = 0;
        while (res != 0) {
            if ((res >> bit & 1) != 0) {
                setBit = bit;
                break;
            }
            bit++;
        }

        int res1 = 0;
        for (int i = 0; i < l; i++) {
            if ((arr[i] >> setBit & 1) != 0)
                res1 = res1 ^ arr[i];
        }

        int num1 = res ^ res1;
        int num2 = num1 ^ res;

        System.out.println("num1: " + num1 + ", num2: " + num2);
    }
}
