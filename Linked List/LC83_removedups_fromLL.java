package LINKLIST;
// Question : Given a sorted linked list, delete all duplicates such that each element appears only once.
// Use the 2-pointer approach to solve this problem.
/* Algorithm:
    1. take pointer A and B at head
    2. move B by checking if A.data==B.data, if yes then move B to B.next till the condition is satisfied
    3. once the condition is not satisfied, move A.next to B and bring A to the position of B
    4. at the end make a.next=null or b and return head
    5. Time complexity : O(n)
    6. Space complexity : O(1)
 */
public class LC83_removedups_fromLL {
    public Node deleteDuplicates(Node head) {
        // edge case
        if(head==null)  return null;
        Node a = head;
        Node b = head;
        while(b!=null){
            if(a.data==b.data){
                b=b.next;
            }else{
                a.next=b;
                a=b;
            }
        }
        a.next=null;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,60,60,70};
        Node head = createLL.convertarr2LL(arr);
        LC83_removedups_fromLL obj = new LC83_removedups_fromLL();
        Node newHead = obj.deleteDuplicates(head);
        createLL.printLL(newHead);
    }
}
