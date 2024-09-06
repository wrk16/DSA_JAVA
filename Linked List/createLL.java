package LINKLIST ;
class Node {
    int data;
    Node next;
    public String val;
    Node(int data1, Node next1){
// this is a constructor of the class Node which is used to create a new node with data and next pointer so that we can create a linked list
        data = data1;
        next = next1;
    }
    Node(int data1){
// this is another constructor which is needed to create a new node with data only 
        data = data1;
        next = null;
    }
};

    public class createLL {
        public static Node convertarr2LL(int arr[]){
            
            Node head = new Node(arr[0]);
            Node temp = head;
            for(int i=1; i<arr.length; i++){
                Node temp1 =  new Node(arr[i]);
                temp.next = temp1;
                temp = temp1;
            }
            return head;
        }
    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertarr2LL(arr);
        //System.out.println(head.data);
        // to print the linked list
        /* Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        */
        // to print the linked list using recursion
        printLL(head);
    }


    static void printLL(Node head) {
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printLL(head.next);
        
    }
    
}