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
    ListNode reverse(ListNode head){
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode nx=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nx;
        }
        return prev;
    }

    void join(ListNode h,ListNode rh){
       // ListNode rh=reverse(nn);
        ListNode t1=null,t2=null;
        while(h!=null && rh!=null){
            t1=h.next;
            h.next=rh;
            t2=rh.next;
            rh.next=t1;
            h=t1;
            rh=t2;
        }
       // return h;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        ListNode mid=head;
        ListNode nn=head; 
        int midd=(cnt/2)+1;
        // if(cnt%2==0){
        //     midd=cnt/2;
        // }else{
        //     midd=(cnt/2)+1;
        // }
        for(int i=1;i<midd;i++){
           mid=mid.next;
        }
        nn=mid.next;
        mid.next=null;

        ListNode rh=reverse(nn);
        
        join(head,rh);




    }
}