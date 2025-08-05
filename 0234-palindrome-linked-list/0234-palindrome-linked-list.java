
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr=new ArrayList<>();

        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int l=0;
        int r=arr.size()-1;
        while(l<r){
        if(!arr.get(l).equals(arr.get(r))) {
            return false;
        }
        l++;
        r--;
        }
        return true;
    }
}