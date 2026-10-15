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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        while(head!=null){
            st.push(head);
            head=head.next;
        }
        if(st.isEmpty()){
            return null;
        }
        ListNode dup=new ListNode(st.pop().val);
        ListNode temp=dup;
        while(!st.isEmpty()){
            ListNode temp1=new ListNode(st.pop().val);
            temp.next=temp1;
            temp=temp1;
        }
        return dup;
    }
}