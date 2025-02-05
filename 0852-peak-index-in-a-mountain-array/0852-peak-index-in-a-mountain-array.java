class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n= arr.length;
        int l=1;
        int r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            int curr=arr[mid];
            if(arr[mid-1]<curr && arr[mid+1]<curr){
                return mid;
            }
            else if(arr[mid-1]<curr){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}