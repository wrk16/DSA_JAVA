// Question: Given the head of a singly linked list, reverse the list, and return the reversed list.

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
/* Algorithm:
    1. create a dummy node D and point on it as Dt
    2. keep a temp pointer at head
    3. while temp!=null
    4. keep a pointer at temp.next as nextNode
    5. Dt.next=temp
    6. temp=nextNode
    7. out of while loop, return D.next
    8. Time complexity : O(n)
    9. Space complexity : O(1)
 */

package LINKLIST;
public class LC206_ReverseLL {
    public Node reverseList(Node head) {
        /* Method 1 :
        Node D=new Node(-1);
        Node Dt=D;
        Node temp=head;
        while(temp!=null){
            Node nextNode=temp.next;
            temp.next=Dt.next;
            Dt.next=temp;
            temp=nextNode;
        }
        return D.next;
        */

        /* Method 2:
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
        */

        /*Method 3:
         */
        // base case
        if(head==null || head.next==null) return head;
        
        Node temp=head.next;
        Node newHead = reverseList(temp);
        temp.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLL.convertarr2LL(arr);
        LC206_ReverseLL obj = new LC206_ReverseLL();
        Node newHead = obj.reverseList(head);
        createLL.printLL(newHead);
    }
}
