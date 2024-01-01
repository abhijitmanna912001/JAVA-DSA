public class EvenOdd {
    public static void main(String[] args) {
        printOddEven(44);
    }

    public static void printOddEven(int num) {
        if (isBitSet(num, 0)) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static boolean isBitSet(int num, int bit) {
        int res = num & (1 << bit);
        return (res == 0) ? false : true;
    }
}
