class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1;
        int r=n-1;
        int k=nums1.length-1;
        while(l>=0 && r>=0){
            if(nums2[r]>nums1[l]){
                nums1[k]=nums2[r];
                r--;
                k--;
            }
            else{
                nums1[k]=nums1[l];
                l--;
                k--;
            }
        }
        while(l>=0){
            nums1[k]=nums1[l];
            l--;
            k--;
        }
        while(r>=0){
            nums1[k]=nums2[r];
            r--;
            k--;
        }
    }
}