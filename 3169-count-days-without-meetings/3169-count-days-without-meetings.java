class Solution {
    private int[][] MergeMeetings(int[][] arr)
    {
        Arrays.sort(arr, (a, b) -> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        Stack<int[]> st = new Stack<>();
        for(int i =0;i<arr.length;i++)
        {
            if(st.isEmpty() || st.peek()[1]<arr[i][0])
            st.add(arr[i]);
            else
            st.peek()[1] = Math.max(st.peek()[1],arr[i][1]);
        }
        return st.toArray(new int[st.size()][]);
    }
    public int countDays(int days, int[][] meetings) 
    {
        int[][] meets = MergeMeetings(meetings);        
        int ans =0;
        int n = meets.length;
        ans = meets[0][0]-1;
        for(int i=1;i<n;i++)
        {
            ans+=meets[i][0] - meets[i-1][1]-1;
        }
        ans += days-meets[n-1][1];
        return ans;
    }
}