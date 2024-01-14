public class Rotation {
    public static void main(String[] args) {
        int arr[] = { 64, 3, 5, 7, 9 };
        int index = minElement(arr);
        System.out.println(arr[index]);
        rotationCountClockwise(arr);
        rotationCountAntiClockwise(arr);
    }

    static void rotationCountClockwise(int arr[]) {
        int index = minElement(arr);
        System.out.println("Rotation Count is: " + index);
    }

    static void rotationCountAntiClockwise(int arr[]) {
        int index = minElement(arr);
        System.out.println("Anti Clockwise Rotation Count is: " + (arr.length - index) % arr.length);
    }

    static int minElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[end] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
