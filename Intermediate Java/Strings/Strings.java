public class Strings {
    public static void main(String[] args) {
        // String name = "Abhijit";
        // System.out.println(name);
        // int arr[] = new int[3];
        // arr[0] = 4;
        // System.out.println(arr[0]);
        // int brr[] = arr;
        // brr[0] = 8;
        // System.out.println(arr[0]);
        // int crr[] = new int[3];
        // crr[0] = 10;
        // System.out.println(arr[0]);
        // System.out.println(brr[0]);
        // System.out.println(crr[0]);

        int arr[] = new int[3];
        arr[0] = 4;
        String name1 = "Abhijit";
        System.out.println(name1);
        String name2 = name1;
        int brr[] = arr;
        brr[0] = 8;
        name2 = "Amit";
        System.out.println(name1);
        int crr[] = new int[3];
        crr[0] = 10;
        String name3 = "Abhijit";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}