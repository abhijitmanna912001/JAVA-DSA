// https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Solved this GFG question using below logic

public class KElementSorted {
    public static void main(String[] args) {

    }

    public long kthElement(int nums1[], int nums2[], int n, int m, int k) {
        if (nums1.length > nums2.length) {
            return kthElement(nums2, nums1, m, n, k);
        }
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int start = Math.max(0, k - n2); // 0;
        int end = Math.min(k, n1); // n1;
        while (start <= end) {
            int cut1 = start + (end - start) / 2;
            int cut2 = k - cut1;
           
            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

           
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                end = cut1 - 1;
            } else {
                start = cut1 + 1;
            }
        }
        return 0;
    }
}
