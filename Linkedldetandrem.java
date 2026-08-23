//To detect and remove the cycle in linked list


/* for companies tests
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
} */

public class Linkedldetandrem{
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Detect and remove cycle
    public static boolean detectAndRemoveCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Step 2: Find starting point of cycle
                slow = head;

                if (slow == fast) {
                    // Cycle starts at head
                    while (fast.next != slow) {
                        fast = fast.next;
                    }
                } else {
                    while (slow.next != fast.next) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                }

                // Step 3: Remove cycle
                fast.next = null;

                return true;
            }
        }

        return false;
    }

    // Display linked list
    public static void display(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        boolean result = detectAndRemoveCycle(head);

        if (result) {
            System.out.println("Cycle detected and removed.");
        } else {
            System.out.println("No cycle found.");
        }

        display(head);
    }
}