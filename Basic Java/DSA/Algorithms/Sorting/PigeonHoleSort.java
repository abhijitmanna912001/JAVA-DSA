public class PigeonHoleSort {
    public static void main(String[] args) {
        int arr[] = { 24, 22, 25, 22, 21, 27 };
        printArray(arr, "original array");
        pigeonHoleSort(arr);
        printArray(arr, "sorted array");
    }

    public static void pigeonHoleSort(int arr[]) {
        int n = arr.length;
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;
        int insertIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
            if (arr[i] < minEle) {
                minEle = arr[i];
            }
        }

        if (maxEle == Integer.MIN_VALUE || minEle == Integer.MAX_VALUE) {
            return;
        }

        int size = maxEle - minEle + 1;
        int pHole[] = new int[size];

        for (int i = 0; i < n; i++) {
            int index = arr[i] - minEle;
            pHole[index]++;
        }

        for (int j = 0; j < size; j++) {
            while (pHole[j] > 0) {
                arr[insertIndex] = j + minEle;
                insertIndex++;
                pHole[j]--;
            }
        }
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

}
