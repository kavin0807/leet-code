class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int ans[]=new int[n1+n2];
        for(int i=0;i<n1;i++){
            ans[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            ans[n1+i]=nums2[i];
        }
        Arrays.sort(ans);
        double median=0;
        int len=ans.length;
        if(len%2==1){
            median=ans[len/2];
        }
        else{
            median=(ans[(len/2)-1]+ans[(len/2)])/2.0;
        }
        return median;
    }
}