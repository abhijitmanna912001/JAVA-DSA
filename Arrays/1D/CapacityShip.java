// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
// https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1

public class CapacityShip {
    public static void main(String[] args) {
        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int res = shipWithinDays(weights, 5);
        System.out.println(res);
    }

    public static int shipWithinDays(int weights[], int days) {
        int start = Integer.MIN_VALUE;
        int end = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > start) {
                start = weights[i];
            }
            end = end + weights[i];
        }

        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isShipmentPossible(weights, mid, days)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    static boolean isShipmentPossible(int weights[], int maxPages, int days) {
        int currentStudent = 1;
        int pages = 0;

        for (int i = 0; i < weights.length; i++) {
            pages += weights[i];
            if (pages > maxPages) {
                currentStudent += 1;
                pages = weights[i];
            }
            if (currentStudent > days) {
                return false;
            }
        }

        return true;
    }
}
