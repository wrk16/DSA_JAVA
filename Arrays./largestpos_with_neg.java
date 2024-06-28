public class largestpos_with_neg {
    public int largestK(int[] nums) {
        int maxK = -1;
        for (int num : nums) {
            if (contains(nums, -num)) {
                maxK = Math.max(maxK, Math.abs(num));
            }
        }
        return maxK;
    }
    private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        largestpos_with_neg solution = new largestpos_with_neg();
        
        // Example 1
        int[] nums1 = {-1, 2, -3, 3};
        System.out.println("Example 1 Output: " + solution.largestK(nums1)); // Output: 3
        
        // Example 2
        int[] nums2 = {-1, 10, 6, 7, -7, 1};
        System.out.println("Example 2 Output: " + solution.largestK(nums2)); // Output: 7
        
        // Example 3
        int[] nums3 = {-10, 8, 6, 7, -2, -3};
        System.out.println("Example 3 Output: " + solution.largestK(nums3)); // Output: -1
    }
}
