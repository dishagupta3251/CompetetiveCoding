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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        if(list1.val>list2.val) // incase the first value of list1 is smaller than list2 then we need to swap as we are assuming list1 to be smaller
        {
            ListNode temp=list1;
            list1=list2;
            list2=temp;

        }
        ListNode res=list1;
        while(list2!=null&&list1!=null)
        {
            ListNode temp=null; //temp is used to keep track of the last node in list1 which was used
            while(list1!=null&&list1.val<=list2.val) // this will run until the value of list1 becomes greater than list2
            {
                temp=list1;    
                list1=list1.next; // list1 will iterate until list1 value gets greater than list2
            }
            temp.next=list2;
            ListNode newn=list1; //swap the list as we have assumed list1 to be smaller as always
            list1=list2;
            list2=newn;
        }
        return res;
    }
}