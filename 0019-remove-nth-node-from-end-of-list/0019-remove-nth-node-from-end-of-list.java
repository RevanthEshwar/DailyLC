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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            return head.next;
        }
        ListNode nn=head;
        for(int i=0;i<cnt-n-1;i++){
            nn=nn.next;
        }
       // nn.val=nn.next.val;
        nn.next=nn.next.next;
        return head;
    }
}