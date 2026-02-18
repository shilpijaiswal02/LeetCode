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

    static ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return null;
        ListNode newNode= middleNode(head);
        ListNode temp=head;
         while(temp!=null&&temp.next!=null){
            if(temp.next==newNode){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
          
         }
         return head;

    }
}