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

        // Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Two pointers
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast n + 1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove nth node from end
        slow.next = slow.next.next;

        return dummy.next;
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

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        System.out.println("Original Linked List:");
        display(head);

        head = removeNthFromEnd(head, 2);

        System.out.println("After removing 2nd node from end:");
        display(head);
    }
}