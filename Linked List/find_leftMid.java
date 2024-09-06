package LINKLIST;
// question : find the left middle element of the linked list
// we know that there are two middle elements in an even length linked list
// we have to return the first one i.e. left middle element
// using slow and fast pointers
public class find_leftMid {
    public int leftmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
}
public static void main(String[] args) {
    int arr[] = {1,2,3,5,6,7};
    Node head = createLL.convertarr2LL(arr);
    find_leftMid obj = new find_leftMid();
    int leftmid = obj.leftmid(head);
    System.out.println("The left middle element is: "+leftmid);
}
}
