import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        int rollNo[] = new int[5];
        // int age[];
        // age = new int[7];

        int dummy[] = { 2, 6, 7, 9, 2, 13, 2 };

        rollNo[0] = 54;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < rollNo.length; i++) {
                System.out.println("Enter " + i + " element: ");
                int element = sc.nextInt();
                rollNo[i] = element;
                // System.out.println(rollNo[i] + " ");
            }
        }

        printArray(rollNo);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}