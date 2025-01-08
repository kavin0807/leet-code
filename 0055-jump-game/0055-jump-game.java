class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1) return true;
        int max = nums[0]; // max posible rechable index
        int i = 0;
        while(i <= max){
            max = Math.max(nums[i] + i++, max);
            if(max >= nums.length -1) return true;
        }
        return false;
    }
}