public class EuclideanGCD {
    public static void main(String[] args) {
        euclidianGCD(24, 36);
        euclidianGCD2(24, 36);
    }

    public static void euclidianGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }

        int res = num1;
        if (num1 == 0) {
            res = num2;

        }
        System.out.println("GCD is: " + res);
    }

    public static void euclidianGCD2(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }

        int res = num1;
        if (num1 == 0) {
            res = num2;

        }
        System.out.println("GCD is: " + res);
    }
}
