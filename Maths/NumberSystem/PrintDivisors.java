// https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
// I solved this question using below logic

public class PrintDivisors {
    public static void main(String[] args) {
        printAllDivisors(36);
    }

    public static void printAllDivisors(int num) {
        int count = 1;
        int sqrt = (int) Math.sqrt(num);
        while (count <= sqrt) {
            if (num % count == 0) {
                System.out.println(count + " is a divisor of " + num);
                int otherNumber = num / count;
                if (otherNumber != count)
                    System.out.println(otherNumber + " is a divisor of " + num);
            }
            count++;
        }
    }
}
