package LINKLIST;
// question : find the intersection point of two linked lists
/* Algorithm:
    1. Assume two LL : 10->20->30->40->50->60->70->null and 100->200->300->400->500->600->700->null
    2. let the first LL be of length m and the second LL be of length n
    3. let the difference between the two LL be d = |m-n|
    4. move the pointer of the longer LL by d steps
    5. move the pointers of both the LL simultaneously until they meet
    6. return the meeting point
 */


public class LC160_intersection {
    public Node intersect(Node headA, Node headB) {
        // len of A
        int lenA=0;
        Node tempA=headA;
        while(tempA!=null){
            tempA=tempA.next;
            lenA++;
        }
        // len of B
        int lenB=0;
        Node tempB=headB;
        while(tempB!=null){
            tempB=tempB.next;
            lenB++;
        }

        // move the pointer of the longer LL by d steps
        if(lenA>lenB){
            for(int i=0;i<lenA-lenB;i++){
                headA=headA.next;
            }
        }
        else{
            for(int i=0;i<lenB-lenA;i++){
                headB=headB.next;
            }
        }
        // move the pointers of both the LL simultaneously until they meet
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;   // return headA or headB
    }

    // Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
   // Output: Intersected at '8'
    public static void main(String[] args) {
        int headA[] = {4,1,8,4,5};
        int headB[] = {5,6,1,8,4,5};
        Node head1 = createLL.convertarr2LL(headA);
        Node head2 = createLL.convertarr2LL(headB);
        Node temp1 = head1;
        Node temp2 = head2;
        // skipA = 2, skipB = 3
        for(int i=0;i<2;i++){
            temp1=temp1.next;
        }
        for(int i=0;i<3;i++){
            temp2=temp2.next;
        }
        // make the intersection point and print only the intersection point
        temp2.next=temp1;
        LC160_intersection obj = new LC160_intersection();
        Node newHead = obj.intersect(head1, head2);
        System.out.println(newHead.data);
    }
}
