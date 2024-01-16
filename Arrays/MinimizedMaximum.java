// https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/description/
// Solved this question using below logic

public class MinimizedMaximum {
    public static void main(String[] args) {

    }

    public int minimizedMaximumProducts(int n, int[] quantities) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        int res = -1;

        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > end) {
                end = quantities[i];
            }
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isDistributionPossible(quantities, mid, n)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }

    boolean isDistributionPossible(int[] quantities, int maxProducts, int stores) {
        int storeCount = 0;

        for (int i = 0; i < quantities.length; i++) {
            storeCount += quantities[i] / maxProducts;
            if (quantities[i] % maxProducts != 0) {
                storeCount += 1;
            }
            if (storeCount > stores) {
                return false;
            }
        }

        return true;
    }
}
