// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// I solved this question using both max and min logic

public class FindMin {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4, 0, 7, 2, 9};
        findMin(arr);
    }

    public static void findMin(int arr[]) {
        // int min = arr[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
