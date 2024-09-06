package LINKLIST;
// Question : Given the head of a linked list, rotate the list to the right by k places.
/* Algorithm:
    1. keep slow and fast pointers at head
    2. move fast by k nodes
    3. now increase slow and fast by 1 
    4. once fast.next = Null Stop and create new head(H) for slow.next 
    5. point fast.next = head and return the new head(H).
    6. Time complexity : O(n)
    7. Space complexity : O(1)
 */

public class LC61_rotateLL {
    public Node rotate(Node head, int k){
        // base case
        if(head==null || head.next==null)  return head;
        Node temp=head;
        int n=0;
        while (temp!=null){
            temp=temp.next;
            n++;
        }
        k=k%n;
        if(k==0)   return head;
        Node slow = head;
        Node fast = head;
        // move fast by k nodes 
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        // move slow and fast by 1
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node newHead = slow.next;
        slow.next=null;
        fast.next=head;
        return newHead;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        Node head = createLL.convertarr2LL(arr);
        LC61_rotateLL obj = new LC61_rotateLL();
        int k = 3;
        Node newHead = obj.rotate(head, k);
        createLL.printLL(newHead);
    }
}
