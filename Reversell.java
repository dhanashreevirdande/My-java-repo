//Reverce linkedlist
import java.util.*;

public class Reversell{

     static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void display(ListNode head){
        ListNode current= head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        ListNode head=new ListNode(10);
        head.next= new ListNode(20);
        head.next.next=new ListNode(30);
        head.next.next.next=new ListNode(40);
        head.next.next.next.next=null;
       System.out.println("LinkedList Before Reversing ");
       display(head);
        head=reverse(head);
        System.out.println("LinkedList After Reversing ");
        display(head);
    }
}