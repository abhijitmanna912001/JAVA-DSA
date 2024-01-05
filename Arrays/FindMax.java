// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// I solved this using below logic

public class FindMax {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4, 1, 7, 2, 9 };
        findMax(arr);
    }

    public static void findMax(int arr[]) {
        // int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}