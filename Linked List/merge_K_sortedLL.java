package LINKLIST;
/* Question : You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. 
Merge all the linked-lists into one sorted linked-list and return it.

Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6

Algorithm:
    1. base case if lists is empty return null
    2. mergeKLists(lists, start, end)
    3. if start==end return lists[start]
    4. find mid = start + (end-start)/2
    5. merge left = mergeKLists(lists, start, mid)
    6. merge right = mergeKLists(lists, mid+1, end)
    7. return merge(left, right)
    8. merge(left, right)
    9. take a dummy node and a pointer to it with any value
    10. take a temp pointer to dummy node, temp1 to l1 and temp2 to l2
    11. while temp1 and temp2 are not null, compare temp1 and temp2
    12. if temp1.data < temp2.data then 
    temp.next = temp1 
    temp1 = temp1.next
    13. else temp.next = temp2 
                temp2 = temp2.next
    14. move temp to temp.next to keep the track of the linked list
    15. if temp1!=null then temp.next = temp1
    16. if temp2!=null then temp.next = temp2
    17. return dummy.next
    18. Time complexity : O(nlogk)
    19. Space complexity : O(1)

 */
public class merge_K_sortedLL {
    public Node mergeKLists(Node[] lists) {
        // base case if lists is empty
        if(lists.length==0) return null;
        return mergeKLists(lists, 0, lists.length-1);

    }
    // mergeKLists(lists, start, end) function will merge the linked lists from start to end index in the lists array
    public Node mergeKLists(Node[] lists, int start, int end){
        // base case if both start and end are at same index
        if(start==end) return lists[start];
        int mid = start + (end-start)/2;
        Node left = mergeKLists(lists, start, mid);
        Node right = mergeKLists(lists, mid+1, end);
        return merge(left, right);
    }
    // merge(left, right) function will merge the two linked lists left and right in sorted order and return the merged linked list
    public Node merge(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1!=null) temp.next = l1;
        if(l2!=null) temp.next = l2;
        return dummy.next;
    }
    public static void main(String[] args) {
        int arr1[] = {1,4,5};
        int arr2[] = {1,3,4};
        int arr3[] = {2,6};
        Node head1 = createLL.convertarr2LL(arr1);
        Node head2 = createLL.convertarr2LL(arr2);
        Node head3 = createLL.convertarr2LL(arr3);
        Node lists[] = {head1, head2, head3};
        merge_K_sortedLL obj = new merge_K_sortedLL();
        Node newHead = obj.mergeKLists(lists);
        createLL.printLL(newHead);
    }
}