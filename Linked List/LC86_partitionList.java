// Question : Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x. You should preserve the original relative order of the nodes in each of the two partitions.
// Input: head = [1,4,3,2,5,2], x = 3
// Output: [1,2,2,4,3,5]
/* Algorithm:
    1. create two dummy nodes a and b
    2. keep two temp pointers in a and b as ta and tb
    3. keep a pointer at head as temp
    4. while temp!=null
    5. if temp.data<x
           ta.next=temp
            ta=ta.next
    6. else
           tb.next=temp
           tb=tb.next
    7. temp=temp.next
    8. out of while loop, tb.next=null as we need to end the list
    9. a=a.next and b=b.next
    10. if a==null, return b as there is no element less than x in the list
    11. attach list a to b by ta.next =b
    12. return a
 */

package LINKLIST;

public class LC86_partitionList {
    public Node partition(Node head, int x) {
        Node a=new Node(-1);
        Node b=new Node(-1);
        Node ta=a;
        Node tb=b;
        Node temp=head;
        while(temp!=null){
            if(temp.data<x){
                ta.next=temp;
                ta=ta.next;
            }
            else{
                tb.next=temp;
                tb=tb.next;
            }
            temp=temp.next;
        }
        tb.next=null;
        ta.next=b.next;
        return a.next;
    }
    public static void main(String[] args) {
        int arr[] = {2,1};
        Node head = createLL.convertarr2LL(arr);
        int x = 2;
        LC86_partitionList obj = new LC86_partitionList();
        Node newHead = obj.partition(head, x);
        createLL.printLL(newHead);
    }
}
