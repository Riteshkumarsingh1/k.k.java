class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = sol.searchRange(nums, target);
        System.out
                .println("First and Last Position of Element in Sorted Array: [" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;

        // Find the first occurrence of the target
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start >= nums.length || nums[start] != target) {
            return ans; // Target not found
        }
        ans[0] = start; // First occurrence index

        // Find the last occurrence of the target
        end = nums.length - 1; // Reset end to the last index
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        ans[1] = end; // Last occurrence index

        return ans;
    }
}