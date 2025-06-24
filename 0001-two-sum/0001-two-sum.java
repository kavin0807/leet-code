class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = i + 1;

        while (i < n - 1) {
            while (j < n) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            }
            i++;
            j = i + 1; // Reset j after each i
        }

        return new int[]{};
    }
}
