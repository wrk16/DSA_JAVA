// Question : Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts. The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null. The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later. Return an array of the k parts. 

// Input: head = [1,2,3], k = 5
// Output: [[1],[2],[3],[],[]]
/* Algorithm: 
    1. take a temp pointer at head and find the length of the linked list
    2. find the size of each part and the remaining elements
    3. create an array of k nodes
    4. reset the temp pointer to head
    5. iterate over the array i from 0 to k 
    6. assign the ith element of the array to temp
    7. find the part size as size+(rem-->0?1:0) as we need to distribute the remaining elements
    8. iterate over the part size and assign the next element to temp
    9. if temp!=null, and next element to temp.next and assign null to temp.next and assign temp to next
    10. return the array
    11. Time complexity : O(n)
    12. Space complexity : O(1)
 */


package LINKLIST;
public class LC725_splitLL_inParts {
    public Node[] splitListToParts(Node head, int k) {
        Node temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
    }
    int size=len/k;
    int rem=len%k;
    Node[] res=new Node[k];
    temp=head;
    for(int i=0;i<k;i++){
        res[i]=temp;
        int partSize=size+(rem-->0?1:0);   //rem-->0?1:0 means if rem>0, then rem--, else 0 
        for(int j=0;j<partSize-1;j++){
            temp=temp.next;
        }
        if(temp!=null){
            Node next=temp.next;
            temp.next=null;
            temp=next;
        }
    }
    return res;
}
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Node head = createLL.convertarr2LL(arr);
        int k = 5;
        LC725_splitLL_inParts obj = new LC725_splitLL_inParts();
        Node[] newHead = obj.splitListToParts(head, k);
        for(Node n:newHead){
            createLL.printLL(n);
        }
    }
}
