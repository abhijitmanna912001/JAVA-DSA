// https://www.geeksforgeeks.org/problems/searching-an-element-in-a-sorted-array-ternary-search--141631/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// Solved this question using below logic 

public class TernarySearch {
    public static void main(String[] args) {

    }

    public static int ternarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        int index = -1;

        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            if (target <= arr[mid1]) {
                if (target == arr[mid1]) {
                    index = mid1;
                    break;
                }
                end = mid1 - 1;
            } else if (target >= arr[mid2]) {
                if (target == arr[mid2]) {
                    index = mid2;
                    break;
                }
                start = mid2 + 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }

        return index;
    }
}
