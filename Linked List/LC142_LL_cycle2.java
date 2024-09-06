package LINKLIST;
// Problem : Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
/* Algorithm:
    1. maintain slow and fast pointers at head
    2. check for the self loop in the linked list with the condition if (head==null || head.next==null) then return null
    3. move slow by 1 and fast by 2 until (fast!=null && fast.next!=null)
    4. if slow==fast then break
    5. if fast!=slow then return null
    6. once cycle is detected, move temp pointer to head
    7. move slow and temp pointers simultaneously until slow!=temp
    8. return slow
    8. Time complexity : O(n)
    9. Space complexity : O(1)
 */
public class LC142_LL_cycle2 {
    public Node detectCycle(Node head){
        if(head==null || head.next==null)    return null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
       if(fast!=slow)  return null;
       
        Node temp = head;
        while(slow!=temp){
            slow=slow.next;
            temp=temp.next;
        }
        
        return slow;
}
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        Node head = createLL.convertarr2LL(arr);
        // creating a cycle in the linked list
        // Input: head = [3,2,0,-4], pos = 1
       // Output: tail connects to node index 1
       // return the index of the first node where a cycle begins. If there is no cycle, return -1.
        head.next.next.next.next = head.next;
        LC142_LL_cycle2 obj = new LC142_LL_cycle2();
        Node cycleNode = obj.detectCycle(head);
        // give the index of the node
        System.out.println(cycleNode.data);
    }
}