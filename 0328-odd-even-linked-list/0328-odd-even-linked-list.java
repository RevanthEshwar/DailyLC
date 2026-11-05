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
    public ListNode oddEvenList(ListNode head) {
        ListNode odddummy= new ListNode(-1);
        ListNode evendummy=new ListNode(-1);
        ListNode ed=evendummy;
        ListNode od=odddummy;
        int ind=1;
        while(head!=null){
            if((ind)%2==0){
                ed.next=head;
                ed=head;
            }
            else{
                od.next=head;
                od=head;
            }
            ind++;
            head=head.next;
        }
        od.next=evendummy.next;
        ed.next=null;
        return odddummy.next;
    }
}