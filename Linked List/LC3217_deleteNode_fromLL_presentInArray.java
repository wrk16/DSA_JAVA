// Problem: You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.
// Input: nums = [3, 1, 5, 7], head = [1, 2, 3, 4, 5]
// Output: [2, 4]
/* Algorithm:
    1. dummy=head
    2. temp=dummy
    3. while temp.next!=null
    4. flag=false
    5. for i in nums
    6. if temp.next.data==i, flag=true, break
    7. if flag, temp.next=temp.next.next
    8. else temp=temp.next
    9. return dummy.next
    10. Time complexity : O(n)
    11. Space complexity : O(1)
 */

package LINKLIST;

import java.util.HashSet;
import java.util.Set;

public class LC3217_deleteNode_fromLL_presentInArray {
    public Node modifiedList(int[] nums, Node head) {
        Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    
    Node dummy = new Node(-1);
    dummy.next = head;
    Node temp = dummy;
    
    while (temp.next != null) {
        if (set.contains(temp.next.data)) {
            temp.next = temp.next.next;
        } else {
            temp = temp.next;
        }
    }
    
    return dummy.next;
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Node head = createLL.convertarr2LL(arr);
        int nums[] = {5};
        LC3217_deleteNode_fromLL_presentInArray obj = new LC3217_deleteNode_fromLL_presentInArray();
        Node newHead = obj.modifiedList(nums, head);
        createLL.printLL(newHead);
    }
}
