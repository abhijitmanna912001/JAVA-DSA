public class PrimeNumber {
    public static void main(String[] args) {
        primeNumbers(1);
    }

    public static void primeNumbers(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime no ");
            return;
        }
        int count = 2;
        int sqrt = (int) Math.sqrt(num);
        while (count <= sqrt) {
            if (num % count == 0) {
                System.out.println(num + " is not a prime no ");
                return;
            }
            count++;
        }
        System.out.println(num + " is a prime no ");
    }
}
