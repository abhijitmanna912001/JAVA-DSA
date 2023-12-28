// https://www.geeksforgeeks.org/problems/decimal-to-binary-1587115620/1
// Solved this using this logic

public class decimalBinary {
    public static void main(String[] args) {
        // decimalToBinary(5);
        // decimalToAnyBase(25, 2);
        // binaryToDecimal(101);
        AnyBaseToDecimal(101, 2);
    }

    static void decimalToBinary(int decimalNum) {
        int resNum = 0;
        int power = 0;

        while (decimalNum > 0) {
            int rem = decimalNum % 2;
            decimalNum /= 2;
            resNum += rem * Math.pow(10, power);
            power++;
        }

        System.out.println("Result is: " + resNum);
    }

    static void decimalToAnyBase(int decimalNum, int base) {
        int resNum = 0;
        int power = 0;

        while (decimalNum > 0) {
            int rem = decimalNum % base;
            decimalNum /= base;
            resNum += rem * Math.pow(10, power);
            power++;
        }

        System.out.println("Result is: " + resNum);
    }

    static void binaryToDecimal(int binaryNum) {
        int resNum = 0;
        int power = 0;

        while (binaryNum > 0) {
            int unitDigit = binaryNum % 10;
            binaryNum /= 10;
            resNum += unitDigit * Math.pow(2, power);
            power++;
        }

        System.out.println("Result is: " + resNum);
    }

    static void AnyBaseToDecimal(int binaryNum, int base) {
        int resNum = 0;
        int power = 0;

        while (binaryNum > 0) {
            int unitDigit = binaryNum % 10;
            binaryNum /= 10;
            resNum += unitDigit * Math.pow(base, power);
            power++;
        }

        System.out.println("Result is: " + resNum);
    }
}
