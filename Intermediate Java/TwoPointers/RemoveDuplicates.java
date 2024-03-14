public class RemoveDuplicates {
    public int removeDuplicates2(int[] nums) {
        int oI = 0, i = 0;

        while (i < nums.length) {
            int sI = i;

            // Find the end of the current group of duplicates
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }

            // Calculate frequency of the current element
            int freq = Math.min(i - sI + 1, 2);

            // Copy the current element at most twice
            while (freq-- > 0) {
                nums[oI++] = nums[sI];
            }

            i++;
        }

        return oI;
    }

    public int removeDuplicates(int[] nums) {
        int oI = 0, i = 0;
        while (i < nums.length) {
            int sI = i;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }

            int length = i - sI + 1;
            int freq = Math.min(length, 2);

            while (freq-- > 0) {
                nums[oI] = nums[sI];
                oI++;
            }
            i++;
        }

        return oI;
    }

    public static void main(String[] args) {

    }
}
