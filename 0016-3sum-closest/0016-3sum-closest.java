class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int j = Integer.MAX_VALUE; // Change to properly initialize to a high value
        if (nums == null || n < 3) { // Fix condition to logical OR
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                // Update closest sum comparison logic
                if (Math.abs(sum - target) < Math.abs(j - target)) {
                    j = sum;
                }
                if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return j;
    }
}