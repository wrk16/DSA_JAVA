package LINKLIST;

// ques : i/p - [1,2,3,4,5,6,7,9] o/p - 5
// there are two middle elements(4,5) we have to return the second one e.i. right middle element

// there are two approaches to solve this problem
// 1. using two pointers
// Algorithm : 1. find the length of the linked list
// 2. store the mid=(length/2)+1
// 3. iterate the linked list from i=1 to mid and take a temp pointer -> temp=temp.next  &   return temp.data

// 2. using slow and fast pointers
// Algorithm : 1. initialize two pointers slow and fast to the head of the linked list
// 2. iterate the linked list until fast.next!=null && fast.next.next!=null
// 3. increment the slow pointer by 1 and fast pointer by 2
// 4. return the slow pointer's data
// time complexity : O(n/2) = O(n)
// space complexity : O(1)

public class LC876_midoftheLL {
    // using two pointers
    public static int midnode(Node head){
        Node temp=head;
        int length=0;
        // find the length of the linked list
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        // store the mid=(length/2)+1
        int mid=(length/2)+1;
        temp=head;
        for(int i=1;i<mid;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    // using slow and fast pointers
    public static int midnode1(Node head){
        // if the LL is of odd length;
        /* Node slow=head;
        Node fast=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
        */

        // if the LL is of even length;
        /*
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            }
        return slow.data;
         */
    // combining both the above two cases we get the below code
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
        /*
        if we do while(fast.next!=null && fast!=null) why it is wrong?
        The reason is : if we check fast.next!=null first and then fast!=null, then it will give null pointer exception because null does not have any next pointer. 
        */
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};  // even length
        int arr1[] = {1,2,3,4,5,6,7,9};  // odd length
        Node head = createLL.convertarr2LL(arr);
        Node head1 = createLL.convertarr2LL(arr1);
        System.out.println(midnode(head));
        System.out.println(midnode1(head1));
    }
}
