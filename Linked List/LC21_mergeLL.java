package LINKLIST;
// Question : Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
/* Algorithm : 
    1. take a dummy node and a pointer to it with any value
    2. take a temp pointer to dummy node, temp1 to l1 and temp2 to l2
    3. while temp1 and temp2 are not null, compare temp1 and temp2
    4. if temp1.data < temp2.data then 
    temp.next = temp1 
    temp1 = temp1.next
    5. else temp.next = temp2 
                temp2 = temp2.next
    6. move temp to temp.next to keep the track of the linked list
    7. if temp1!=null then temp.next = temp1
    8. if temp2!=null then temp.next = temp2
    9. return dummy.next
    10. Time complexity : O(n)
    11. Space complexity : O(1)
    */

public class LC21_mergeLL {
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
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,50};
        int arr2[] = {15,25,35,45,55};
        Node head1 = createLL.convertarr2LL(arr1);
        Node head2 = createLL.convertarr2LL(arr2);
        LC21_mergeLL obj = new LC21_mergeLL();
        Node newHead = obj.mergeTwoLists(head1, head2);
        createLL.printLL(newHead);
    }
}
