package LINKLIST;
// Question : Given the head of a linked list, return the list after sorting it in ascending order.
/* Algorithm:
    1. base case
    2. take firsthalf=head, slow=head, fast=head
    3. move slow and fast pointers until fast.next!=null and fast.next.next!=null
    4. move secondhalf = slow.next and slow.next=null
    5. sort firsthalf and secondhalf
    6. merge(code from mergeLL) firsthalf and secondhalf
    7. return result
    8. Time complexity : O(nlogn)
    9. Space complexity : O(1)
 */
public class sort {
    public Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = l1;
        Node temp2 = l2;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.next = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1!=null) temp.next = temp1;
        if(temp2!=null) temp.next = temp2;
        return dummy.next;
    }
    public Node sortList(Node head) {
        // base case
        if(head==null || head.next==null)  return head;
        Node firsthalf=head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondhalf = slow.next;
        slow.next=null;
        firsthalf = sortList(firsthalf);
        secondhalf = sortList(secondhalf);
        Node result=mergeTwoLists(firsthalf, secondhalf);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {-1,5,3,4,0};
        Node head = createLL.convertarr2LL(arr);
        sort obj = new sort();
        Node newHead = obj.sortList(head);
        createLL.printLL(newHead);
    }

}
