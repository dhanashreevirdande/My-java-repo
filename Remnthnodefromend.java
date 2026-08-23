// find nth node from last of ll
//in java
/*public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null || head.next == null) {
        return null;
    }

    int size = 0;
    ListNode current = head;

    while (current != null) {
        current = current.next;
        size++;
    }

    if (n == size) {
        return head.next;
    }

    int indexToSearch = size - n;
    ListNode prev = head;
    int i = 1;

    while (i < indexToSearch) {
        prev = prev.next;
        i++;
    }

    prev.next = prev.next.next;

    return head;
}
*/
import java.util.*;
public class Remnthnodefromend {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // If list is empty or has only one node
        if (head == null || head.next == null) {
            return null;
        }

        // Find the size of the linked list
        int size = 0;
        ListNode current = head;

        while (current != null) {
            current = current.next;
            size++;
        }

        // If removing the first node
        if (n == size) {
            return head.next;
        }

        // Find the node before the node to be removed
        int indexToSearch = size - n;

        ListNode prev = head;
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        return head;

    }
    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
       public static void main(String[] args) {

        // Create linked list
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        System.out.println("Original Linked List:");
        display(head);

        // Remove 2nd node from the end
        head = removeNthFromEnd(head, 2);

        System.out.println("After removing 2nd node from end:");
        display(head);
    }
}