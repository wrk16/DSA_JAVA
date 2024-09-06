package LINKLIST;
// question : remove the nth node from the end of the linked list
/*  Method 1: brute force approach
    1. Assume a LL : 10->20->30->40->50->60->70->null
    2. let n be the node to be removed from the end of the LL ; n=3
    3. to remove the node 3, we need the access to the node 4 from the end, so that 40.next.next will be 60
    4. find the length of the LL ; length=7
    5. nth node from the end=length-n+1=7-3+1=5 node from the start. To remove the  (length-n+1)th node , we need (length-n)th node 
*/

public class LC19_removeNthnodeFromEnd {
    public Node removeNthFromEnd(Node head, int n){
        Node temp=head;
        int len=0;
        while (temp!=null){
            temp=temp.next;
            len++;
        }
        if(n==len)  return head.next;   // edge case
        temp=head;
        for(int i=1;i<len-n;i++){
            temp=temp.next;
        }
        // deletion
        temp.next=temp.next.next;
        return head;
    }

    /* Method 2: using slow and fast pointers
    1. Assume a LL : 10->20->30->40->50->60->70->null
    2. let n be the node to be removed from the end of the LL ; n=2
    3. move fast 'n' steps ahead
    4. move slow and fast pointers simultaneously until fast.next!=null
    5. slow.next=slow.next.next 
     */
    public Node removeNthFromEnd1(Node head, int n){
        Node slow=head;
        Node fast=head;
        // move fast 'n' steps ahead
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        // edge case
        if(fast==null)  return head.next;
        // move slow and fast pointers simultaneously until fast.next!=null
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // deletion
        slow.next=slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        Node head = createLL.convertarr2LL(arr);
        LC19_removeNthnodeFromEnd obj = new LC19_removeNthnodeFromEnd();
        Node newhead = obj.removeNthFromEnd(head, 2);
        createLL.printLL(newhead);
        System.out.println();
        Node newhead1 = obj.removeNthFromEnd1(head, 2);
        createLL.printLL(newhead1);
    }
        
}
