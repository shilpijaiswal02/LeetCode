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
    static ListNode mergeTwoList(ListNode list1,ListNode list2){
         ListNode t1=list1;
         ListNode t2=list2;
         ListNode dummy=new ListNode(-1);
         ListNode temp=dummy;
         if(list1==null)return list2;
         if(list2==null)return list1;
         while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
               temp.next=t1;
               temp=t1;
               t1=t1.next; 
              
                
            }else{
               temp.next=t2;
               temp=t2;
               t2=t2.next;
            }
            

         }
         if(t1!=null) temp.next=t1;
          if(t2!=null)temp.next=t2;
          return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null ||lists.length==0)return null;
       ListNode  head=lists[0];
        for(int i=1;i<lists.length;i++){
            head=mergeTwoList(head,lists[i]);
        }
        return head;
    }
}