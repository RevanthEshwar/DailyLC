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
    public int getDecimalValue(ListNode head) {
        //by using string
        String ss="";
        while(head!=null){
            ss=ss+head.val;
            head=head.next;
        }
        return Integer.parseInt(ss,2);

        //another way to solve by multiplying 2 
        // int n=0;
        // while(head!=null){
        //     n=(n*2)+head.val;
        //     head=head.next;
        // }
        // return n;
    }
}