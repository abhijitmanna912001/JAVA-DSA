// https://www.geeksforgeeks.org/problems/decimal-to-binary-1587115620/0

public class DecimalBinary {
    public void toBinary(int N) {
        if (N == 0) {
            return;
        }
        toBinary(N / 2);
        System.out.print(N % 2);
    }

    public static void main(String[] args) {

    }
}