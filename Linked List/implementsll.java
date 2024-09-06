package LINKLIST;
// This is the class that implements the linked list interface
class SLL{      //user defined data structure
    Node head;
    Node tail; 
    int size;
    void addAtEnd(int val){
        //create a new node
        Node newNode = new Node(val);
        // case 1: if the list is empty
        if(head ==null)  head = tail = newNode;
        // case 2: if the list is not empty
        else{
            tail.next=newNode;
            tail = newNode;
        } 
        size++;
    }

    void insertathead(int val){
        Node temp=new Node(val);
        if(head==null)  head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void insertatanyidx(int idx, int val)  throws Error{    // using 0-based indexing
        // the 3 base cases are :
        // 1. if the index is 0, then we can insert at the head
        // 2. if the index is equal to the size of the linked list, then we can insert at the end
        // 3. if the index is invalid, then we can return
        if(idx==0)  insertathead(val);
        else if(idx==size)  addAtEnd(val);
        else if(idx>size || idx<0) throw new Error("Invalid index");           
        Node temp=new Node(val);
        Node x=head;  // x is the node before the index where we want to insert the new node
        for(int i=0; i<idx-1; i++)  x=x.next;
        temp.next=x.next;
        x.next=temp;
        size++;
        }

// This is a getter method that is used to get the element at a particular index    
        int getEle(int index){
        // the 3 base cases are :
        // 1. if the index is 0, then we can insert at the head
        // 2. if the index is equal to the size of the linked list, then we can insert at the end
        // 3. if the index is invalid, then we can return
        if(index==0)  return head.data;
        else if(index==size)  return tail.data;
        else if(index>size || index<0) throw new Error("Invalid index");
        else{
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }

// This is a setter method that is used to set the element at a particular index    
        void setEle(int index, int val){
            // the 3 base cases are :
            // 1. if the index is 0, then we can insert at the head
            // 2. if the index is equal to the size of the linked list, then we can insert at the end
            // 3. if the index is invalid, then we can return
            if(index==0)  head.data=val;
            else if(index==size)  tail.data=val;
            else if(index>size || index<0) throw new Error("Invalid index");
            else{
                Node temp=head;
                for(int i=1;i<=index;i++){
                    temp=temp.next;
                }
                temp.data=val;
            }
        }

    void deleteAtHead(){
        if(head==null)  return;
        if(head==tail)  head=tail=null;
        else{
            head=head.next;
        }
        size--;
    }

    void deleteAtTail(){
        if(head==null)  return;
        if(head==tail)  head=tail=null;
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
        }
        size--;
    }

    void findtail(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null)  System.out.println("The tail is: "+temp.data);
        return;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size() {

        System.out.println("The size of the linked list is: " + size);
    }
}
public class implementsll {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtEnd(60);
        list.addAtEnd(70);
        list.insertathead(100);
        list.insertatanyidx(5, 400);
        list.setEle(5, 500);
        System.out.println("The ele is : "+list.getEle(5));
        list.findtail();
        list.size();
        list.display();    // this is a method that is used to display the linked list
    }
}
