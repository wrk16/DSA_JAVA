package LINKLIST;
// question : find the Nth node from the end of the linked list
/* Algorithm:
    1. Assume a LL : 10->20->30->40->50->60->70->null
    2. maintain slow and fast pointers  at head
    3. move fast to Nth node from the start of the LL
    4. move slow and fast pointers simultaneously until fast.next!=null
    5. return data of slow pointer as it will be the Nth node from the end of the LL

    Time complexity : O(n)
    Space complexity : O(1)
 */
    
public class find_Nth_from_end {
    public int findNthFromEnd(Node head, int N) {
        Node slow=head;
        Node fast=head;
        // move fast to Nth node from the start of the LL
        for(int i=1;i<N;i++){
            fast=fast.next;
        }
        // move slow and fast pointers simultaneously until fast.next!=null
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        Node head = createLL.convertarr2LL(arr);
        find_Nth_from_end obj = new find_Nth_from_end();
        int N = 3;
        int NthNode = obj.findNthFromEnd(head, N);
        System.out.println(NthNode);
    }
}
