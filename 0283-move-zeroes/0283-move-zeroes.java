class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[j++] = nums[i];
            }
        }
        for (int i = 0; i < count; i++) {
            nums[j++] = 0;
        }
    }
}