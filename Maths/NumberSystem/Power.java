public class Power {
    public static void main(String[] args) {
        // power(2, 5);
        power2(2, 5);
    }

    static double power(int num, int pow) {
        double res = 1;
        for (int i = 0; i < pow; i++) {
            res = res * num;
        }
        System.out.println(res);
        return res;
    }

    static double power2(int num, int pow) {
        double res = 1;
        while (pow > 0) {
            if (pow % 2 != 0) {
                res = res * num;
                pow = (pow - 1) / 2;
            } else {
                pow /= 2;
            }
            num = num * num;
        }

        System.out.println(res);
        return res;
    }
}
