public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }

    static void factorial(int num) {
        double res = 1;

        while (num > 1) {
            res *= num;
            num--;
        }
        System.out.println(res);
    }
}
