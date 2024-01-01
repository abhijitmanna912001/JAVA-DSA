// https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1
// I solved this using below logic

public class PowerOfTwo {
    public static void main(String[] args) {
        isPowerOfTwo(0);
    }

    public static void isPowerOfTwo(int num) {
        if (num > 0 && (num & num - 1) == 0) {
            System.out.println("Number is power of 2");
        } else {
            System.out.println("Number is not a power of 2");
        }
    }
}
