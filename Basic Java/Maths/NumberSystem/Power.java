public class Power {
    public static void main(String[] args) {
        // power(2, 5);
        fastexp(1234567, 5, 10007);
    }

    static double power(int num, int pow) {
        double res = 1;
        for (int i = 0; i < pow; i++) {
            res = res * num;
        }
        System.out.println(res);
        return res;
    }

    static double fastexp(long num, long pow, long limit) {
        double res = 1;
        while (pow > 0) {
            if (pow % 2 != 0) {
                // (a mod m)(b mod m) mod m
                res = (res * (num % limit)) % limit;
            }
            pow /= 2;
            num = ((num % limit) * (num % limit)) % limit;
        }

        System.out.println(res);
        return res;
    }
}
