// Problem: Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list. The first node is considered odd, and the second node is even, and so on. Note that the relative order inside both the even and odd groups should remain as it was in the input. You must solve the problem in O(1) extra space complexity and O(n) time complexity.

// Input: head = [1,2,3,4,5]    
// Output: [1,3,5,2,4]
/* Algorithm:
    1. create two dummy nodes odd and even
    2. keep two temp pointers in odd and even as tO and tE
    3. keep a pointer at head as temp
    4. keep a counter i=1 to keep track of odd and even nodes
    5. while temp!=null
    6. if i%2!=0
           tO.next=temp
           tO=tO.next

    7. else
           tE.next=temp
           tE=tE.next
    8. temp=temp.next
    9. increment i
    10. out of while loop, tE.next=null as we need to end the list
    11. tO.next=even.next as we need to attach the even list to the odd list
    12. return odd.next
    13. Time complexity : O(n)
    14. Space complexity : O(1)
 */

package LINKLIST;
public class LC328_oddEvenLL {
    public Node oddEvenList(Node head) {
        Node odd=new Node(-1);
        Node even=new Node(-1);
        Node tO=odd;
        Node tE=even;
        Node temp=head;
        int i=1;
        while(temp!=null){
            if(i%2!=0){
                tO.next=temp;
                tO=tO.next;
            }
            else{
                tE.next=temp;
                tE=tE.next;
            }
            temp=temp.next;
            i++;
        }
        tE.next=null;
        tO.next=even.next;
        return odd.next;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        Node head = createLL.convertarr2LL(arr);
        LC328_oddEvenLL obj = new LC328_oddEvenLL();
        Node newHead = obj.oddEvenList(head);
        createLL.printLL(newHead);
    }
}
