/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode res=head;int c=0;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            c++;}
        int m=0;
        if(c%2==0)
        m=c/2;
        else
        m=(c/2)+1;
        c=0;
        while(c<m)
        {
            res=res.next;
            c++;
        }
        return res;
        
    

    }
}