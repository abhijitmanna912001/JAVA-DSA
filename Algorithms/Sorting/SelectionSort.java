// https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Solved this question using below logic

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 1, 5, 0, 1, 12 };
        printArray(arr, "original array");
        biDirectionSelectSort(arr);
        printArray(arr, "sorted array");
    }

    public static void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void printArray(int arr[], String message) {
        System.out.println("Printing " + message);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();
    }

    public static void selectSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minEle = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minEle) {
                    minEle = arr[j];
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

    public static void biDirectionSelectSort(int arr[]) {
        int n = arr.length;
        int k = n - 1;

        for (int i = 0; i < k; i++) {
            int minEle = arr[i];
            int minIndex = i;
            int maxEle = arr[i];
            int maxIndex = i;

            for (int j = i + 1; j <= k; j++) {
                if (arr[j] < minEle) {
                    minEle = arr[j];
                    minIndex = j;
                } else if (arr[j] > maxEle) {
                    maxEle = arr[j];
                    maxIndex = j;
                }
            }

            swap(arr, i, minIndex);
            if (maxEle == arr[minIndex]) {
                swap(arr, k, minIndex);
            } else {
                swap(arr, k, maxIndex);
            }
            k--;
        }
    }
}
