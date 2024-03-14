// https://leetcode.com/problems/3sum/description/

import java.util.*;

public class ThreeSum {

    // Brute-Force Method
    public List<List<Integer>> threeSum1(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) { // Skipping duplicates
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> triplet = new ArrayList<>();
                            triplet.add(nums[i]);
                            triplet.add(nums[j]);
                            triplet.add(nums[k]);
                            output.add(triplet);
                            break; // Found a triplet, move to the next i
                        }
                    }
                }
            }
        }
        return output;
    }

    // Hashing Method
    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums); // Sorted Array
        List<List<Integer>> answer = new ArrayList<>();

        if (nums.length < 3) {
            return answer;
        }

        if (nums[0] > 0) {
            return answer;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] > 0) {
                break;
            }

            for (int j = i + 1; j < nums.length - 1; ++j) {
                int required = -1 * (nums[i] + nums[j]);
                if (hashMap.containsKey(required) && hashMap.get(required) > j) {
                    answer.add(Arrays.asList(nums[i], nums[j], required));
                }
                j = hashMap.get(nums[j]);
            }

            i = hashMap.get(nums[i]);
        }

        return answer;
    }

    // Two Pointer Approach
    public List<List<Integer>> threeSum3(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Initialize the result list
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Initialize pointers
            int left = i + 1;
            int right = nums.length - 1;

            // Iterate with two pointers approach
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    // Triplet found
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(triplet);

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move pointers
                    left++;
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums1 = { -1, 0, 1, 2, -1, -4 };
        int[] nums2 = { 0, 1, 1 };
        int[] nums3 = { 0, 0, 0 };
        System.out.println("Example 1: " + solution.threeSum3(nums1));
        System.out.println("Example 2: " + solution.threeSum3(nums2));
        System.out.println("Example 3: " + solution.threeSum3(nums3));
    }
}
