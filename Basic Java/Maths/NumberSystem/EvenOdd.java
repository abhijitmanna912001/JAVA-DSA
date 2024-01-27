public class EvenOdd {
    public static void main(String[] args) {
        findEvenOdd(7);
    }

    static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }
    }
}
