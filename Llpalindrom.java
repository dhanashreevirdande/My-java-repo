// find nth node from last of LL
import java.util.*;
public class Llpalindrom {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

public static ListNode reverse(ListNode head){
    ListNode prev=null;
    ListNode curr=head;
    while (curr!=null) {
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        prev=curr;
        curr=next;
    }
    return prev;
}
public ListNode findMid(ListNode head){
    ListNode fast=head;
    ListNode slow=head;
    while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
return slow;
}
public boolean isPlaindrom(ListNode head){
    if(head==null||head.next==null){
        return true;
    }
    ListNode middle=findMid(head);
    ListNode secondhalfstart=reverse(middle.next);
    ListNode firsthalfstart=head;
    while (secondhalfstart!=null) {
        if(firsthalfstart.data !=secondhalfstart.data){
            return false;
        }
        firsthalfstart=firsthalfstart.next;
        secondhalfstart=secondhalfstart.next;
    }
    return true;
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
    head.next.next = new ListNode(20);
    head.next.next.next = new ListNode(10);

    System.out.println("Original Linked List:");
    display(head);

    // Create object of class
    Llpalindrom obj = new Llpalindrom();

    // Check palindrome
    if (obj.isPlaindrom(head)) {
        System.out.println("Linked List is a Palindrome");
    } else {
        System.out.println("Linked List is not a Palindrome");
    }
}
    }
