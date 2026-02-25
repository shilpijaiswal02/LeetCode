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
        ListNode temp=head;
        ListNode prev=null;
        ListNode curr=head;
        while(temp!=null){
           curr=temp.next;
           temp.next=prev;
           prev=temp;
           temp=curr;

        }
        return prev;
      }
       static ListNode FindKthNode(ListNode head, int k){
        ListNode temp=head;
        int count=1;
        while(temp!=null){
            if(count==k){
                return temp;
            }
           temp=temp.next;
           count++;

        }
        return temp;
      }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
         ListNode newNode=null;
        while(temp!=null){
             ListNode Kth=FindKthNode(temp, k);
             if(Kth==null){
              if(prev!=null)prev.next=temp;
              break;
             }
          newNode=Kth.next;
           Kth.next=null;
          ListNode rev=reverse(temp);
          if(temp==head) {head=Kth;}
          else{
            prev.next=Kth;
           
          } prev=temp;
            temp=newNode;

        }
       
      


     return head;






    }
}