import java.util.ArrayList;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {

        ArrayList<Integer> dynamic = new ArrayList<>();

        // int rollNo[] = new int[5];
        // // int age[];
        // // age = new int[7];
        // int dummy[] = { 2, 6, 7, 9, 2, 13, 2 };
        // rollNo[0] = 54;

        // try (Scanner sc = new Scanner(System.in)) {
        // for (int i = 0; i < 3; i++) {
        // System.out.println("Enter " + i + " element: ");
        // int element = sc.nextInt();
        // rollNo[i] = element;
        // }
        // }

        // // printArray(rollNo);
        // // insert(rollNo, 1, 22);
        // printArray(rollNo);
        // delete(rollNo, 1);
        // printArray(rollNo);

        int my2dArray[][] = new int[3][2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < my2dArray.length; i++) {
            for (int j = 0; j < my2dArray[i].length; j++) {
                System.out.println("Enter " + j + " element: ");
                int element = sc.nextInt();
                my2dArray[i][j] = element;
            }
        }

        print2DArray(my2dArray);
        insert2DArray(my2dArray, 0, 0, 5);
        print2DArray(my2dArray);
        delete2DArray(my2dArray, 0, 0);
        print2DArray(my2dArray);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void insert(int arr[], int pos, int element) {
        int size = arr.length;
        if (pos < 0 || pos > size - 1) {
            System.out.println("Wrong position");
            return;
        }

        for (int i = size - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }

    public static void delete(int arr[], int pos) {
        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For " + i + " index");
            printArray(arr[i]);
        }
        System.out.println();
    }

    public static void insert2DArray(int arr[][], int pos1, int pos2, int element) {
        insert(arr[pos1], pos2, element);
        System.out.println();
    }

    public static void delete2DArray(int arr[][], int pos1, int pos2) {
        delete(arr[pos1], pos2);
        System.out.println();
    }
}