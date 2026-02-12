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
    

    static ListNode reverse(ListNode head){
         ListNode prev=null;
         ListNode temp=head;
        ListNode next;
          while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
          }
          return prev;

    }

    static ListNode mid(ListNode head){
         ListNode slow=head;
         ListNode fast=head;
         while(fast.next!=null &&fast.next.next!= null){
            slow=slow.next;
            fast=fast.next.next;
         }
         return slow;
       }
    public boolean isPalindrome(ListNode head) {
           ListNode slow=mid(head);
          ListNode newHead=reverse(slow.next);
         if(head==null ||head.next==null)return  true;
          ListNode first=head;
          ListNode second=newHead;
            while(second !=null){
            if(first.val!=second.val){
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
            
          }
        reverse(newHead);
     return true;
        
    }
}