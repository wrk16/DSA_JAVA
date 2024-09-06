package LINKLIST;
// question : swap the nodes in the linked list
/* Algorithm:
    1. Assume a LL : 10->20->30->40->50->60->70->null
    2. let k be the node to be swapped from the start and end of the LL ; k=3
    3. first keep slow and fast pointers at head
    4. iterate a loop with (--k < 0) and move the fast pointer by k steps
    5. take a new node temp and keep it at the fast pointer
    6. move slow and fast pointers simultaneously until fast.next!=null
    7. swap the slow and temp nodes data
    8. return head
 */

public class LC1721_swapping_nodes_inLL {
    public Node swapNodes(Node head, int k) {
        Node slow=head;
        Node fast=head;
        // iterate a loop with (--k < 0) and move the fast pointer by k steps
        while(--k>0){
            fast=fast.next;
        }
        Node temp=fast;
        // move slow and fast pointers simultaneously until fast.next!=null
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // swap the slow and temp nodes data
        int temp2=slow.data;
        slow.data=temp.data;
        temp.data=temp2;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        Node head = createLL.convertarr2LL(arr);
        LC1721_swapping_nodes_inLL obj = new LC1721_swapping_nodes_inLL();
        Node newhead = obj.swapNodes(head, 3);
        createLL.printLL(newhead);
    }
}
