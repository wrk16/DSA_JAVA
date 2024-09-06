// Problem: Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
// Input: head = [1,2,6,3,4,5,6], val = 6
/* Algorithm:
    1. base case
    2. while head!=null and head.data==val, head=head.next
    3. temp=head, len=0
    4. while temp!=null, temp=temp.next, len++
    5. temp=head
    6. for i=1 to len-1
        if temp.next.data==val, temp.next=temp.next.next
        else temp=temp.next
    7. return head
    8. Time complexity : O(n)
    9. Space complexity : O(1)
 */

package LINKLIST;
public class LC203_removeLLElement {
    public Node removeElements(Node head, int val) {
        while (head != null && head.data == val) {
        head = head.next;
    }
        Node temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        for(int i=1;i<len;i++){
            if(temp.next.data==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }

        }
        return head;
        }
    public static void main(String[] args) {
        int arr[] = {7,7,7,7};
        Node head = createLL.convertarr2LL(arr);
        LC203_removeLLElement obj = new LC203_removeLLElement();
        Node newHead = obj.removeElements(head, 7);
        createLL.printLL(newHead);
    }
}
