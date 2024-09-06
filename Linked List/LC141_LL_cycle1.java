package LINKLIST;
// question : Given head, the head of a linked list, determine if the linked list has a cycle in it.
/* Algorithms : 
    1. maintain slow and fast pointers at head
    2. move slow and fast pointers simultaneously until (fast!=null && fast.next!=null)
    3. if slow==fast then return true
    4. if fast.next==null then return false
    5. Time complexity : O(n)
    6. Space complexity : O(1)


    Example 1 : Imagine a car race track where cars are running in a circular track. If we have two cars A & car B where car A is running with speed 1 and car B is running with sp eed 2, then at some point of time, the car running at a slower speed will meet the car running at a faster speed. This is the concept of Floyd's cycle detection algorithm.
 */
public class LC141_LL_cycle1 {
    public boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
        // while(fast!=null && fast.next!=null && fast.next.next!=null){ // for fast pointer to move 2 steps
        // while(fast!=null && fast.next!=null && fast.next.next!=null && fast.next.next.next!=null){ // for fast pointer to move 3 steps
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        Node head = createLL.convertarr2LL(arr);
        // creating a cycle in the linked list
        head.next.next.next.next.next.next.next = head.next.next;
        LC141_LL_cycle1 obj = new LC141_LL_cycle1();
        boolean hasCycle = obj.hasCycle(head);
        System.out.println(hasCycle);
    }
}
