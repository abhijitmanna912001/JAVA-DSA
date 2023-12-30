// https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
// I solved using these 2 logic also

public class EuclideanGCDandLCM {
    public static void main(String[] args) {
        // euclidianGCD(24, 36);
        // euclidianGCD2(12, 24);
        lcm(12, 24);
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

    public static int euclidianGCD2(int num1, int num2) {
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
        System.out.println(res);
        return res;
    }

    public static void lcm(int num1, int num2) {
        int res = (num1 * num2) / euclidianGCD2(num1, num2);
        System.out.println("LCM is: " + res);
    }
}
