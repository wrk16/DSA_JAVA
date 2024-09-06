package LINKLIST;
// question : find the tail of the linked list 
public class findtail {
    public static void find_tail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null)    System.out.println("The tail is: "+temp.data);
        return;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLL.convertarr2LL(arr);
        find_tail(head);
    }
}
