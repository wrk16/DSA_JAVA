// Question : Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

// Input: head = [1,2,3,4]
// Output: [2,1,4,3]
/*  Algorithm :  
    1. create a dummy node D and point on it as Dt
    2. keep a temp pointer at head
    3. while temp!=null and temp.next!=null 
    4. keep a pointer at temp.next as nextNode
    5. Dt.next=nextNode
    6. temp.next=nextNode.next
    7. nextNode.next=temp
    8. Dt=temp
    9. temp=temp.next
    10. out of while loop, return D.next
    11. Time complexity : O(n)
    12. Space complexity : O(1)
 */


package LINKLIST;
public class LC24_swapNodesinPairs {
    public Node swapPairs(Node head) {
        // base case
        if(head==null || head.next==null) return head;
        Node D=new Node(-1);
        Node Dt=D;
        Node temp=head;
        while(temp!=null && temp.next!=null){
            Node nextNode=temp.next;
            Dt.next=nextNode;
            temp.next=nextNode.next;
            nextNode.next=temp;
            Dt=temp;
            temp=temp.next;
        }
        return D.next;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,};
        Node head = createLL.convertarr2LL(arr);
        LC24_swapNodesinPairs obj = new LC24_swapNodesinPairs();
        Node newHead = obj.swapPairs(head);
        createLL.printLL(newHead);
    }
}

/*
recursive approach:
public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode nextNode=head.next;
        head.next=swapPairs(nextNode.next);
        nextNode.next=head;
        return nextNode;
    }
 */
