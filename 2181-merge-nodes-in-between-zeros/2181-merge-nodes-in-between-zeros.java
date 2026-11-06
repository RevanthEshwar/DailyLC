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
    public ListNode mergeNodes(ListNode head) {
        ListNode res=new ListNode(-1);
        ListNode curr=res;
        ListNode temp=head;
        while(temp!=null && temp.val!=0){
            temp=temp.next;
        }
       // res=temp.val;
        int tot=0;
        while(temp!=null){
            if(temp.val!=0){
                tot+=temp.val;
            }else{
                ListNode sum=new ListNode(tot);
                curr.next=sum;
                curr=curr.next;
                tot=0;
                //res.next=sum;
            }
            temp=temp.next;
        }
        return res.next.next;
    }
}