class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int pre1=0;
        int pre2=0;
        for(int i:nums){
            int temp=pre1;
            pre1=Math.max(pre1,pre2+i);
            pre2=temp;
        }
        return pre1;
    }
}