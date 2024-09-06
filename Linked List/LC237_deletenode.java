package LINKLIST;
// algorithm : 1. In this problem, you are given the head of a singly-linked list and the node to be deleted. You are not given access to the first node of the head. 
// 2. Copy the value from the next node into the current node using the statement node.val = node.next.val. 
// 3. Delete the next node from the linked list by changing the reference of the current node's next to skip the next node and point to the node following it. This is done with node.next = node.next.next. 
// 4. Unlink the node after the current node by setting the next pointer of your current node to the next of the next node. 
// 5. The time complexity of this approach is O(1) as we are not iterating over the linked list.

public class LC237_deletenode {
    public static void deleteNode(Node node) {
        node.data=node.next.data;  // copy the value from the next node into the current node
        node.next=node.next.next;  // delete the next node from the linked list
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,9};
        Node head = createLL.convertarr2LL(arr);
        Node node = head.next;
        deleteNode(node);
        createLL.printLL(head);
    }
}



