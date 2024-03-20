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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=list1;
        ListNode sechalf=null;
        int indx=0;
        while(indx<b){
            t1=t1.next;
            indx++;
        }
        sechalf=t1.next;
        t1.next=null;
        ListNode dummy=new ListNode(-1);
        indx=-1;
        dummy.next=list1;
        t1=dummy;
        while(indx<a-1){
            t1=t1.next;
            indx++;
        }
        t1.next=list2;
        while(t1.next!=null){
            t1=t1.next;
        }
        t1.next=sechalf;

        return dummy.next;
    }
}