import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        // int age[];
        // age = new int[7];

        // int rollNo[] = new int[5];
        // rollNo[0] = 54;
        // try (Scanner sc = new Scanner(System.in)) {
        // for (int i = 0; i < rollNo.length; i++) {
        // System.out.println("Enter " + i + " element: ");
        // int element = sc.nextInt();
        // rollNo[i] = element;
        // // System.out.println(rollNo[i] + " ");
        // }
        // }

        // printArray(rollNo);

        int dummy[] = { 2, 6, 7, 9, 2, 13, 2 };
        insert(dummy, 4, 6);
        printArray(dummy);
    }

    public static void insert(int arr[], int pos, int element) {
        int size = arr.length;
        if (pos < 0 || pos > size - 1) {
            System.out.println("Wrong position");
            return;
        }

        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}