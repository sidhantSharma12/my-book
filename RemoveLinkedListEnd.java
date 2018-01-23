//Given a linked list, remove the nth node from the end of list and return its head.


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        if(n==1){
            if(list.size()==1){
                return null;
            }
            ListNode secondLast = list.get(list.size()-2);
            secondLast.next=null;
        }
        else if(n == list.size()){
            head=head.next;
        }
        else{
            ListNode listNode = list.get(list.size()-n-1);
            listNode.next = listNode.next.next;
        }    
        return head;
    }
}
