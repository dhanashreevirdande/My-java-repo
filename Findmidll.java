public class Findmidll {

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    
        
    } 
    public static ListNode findMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast!=null && fast.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
public static void display(ListNode head){
    ListNode current=head;
    while(current!=null){
        System.out.print(current.data +"->");
        current=current.next;
    }
    System.out.println("null");
   
}
public static void main(String args[]){
    ListNode head=new ListNode(10);
    head.next=new ListNode(20);
    head.next.next=new ListNode(30);
    head.next.next.next=new ListNode(40);
    head.next.next.next.next=new ListNode(50);
    head.next.next.next.next.next=null;
    display(head);
    ListNode mid=findMiddle(head);
    System.out.println("Middle of LinkedList:"+ mid.data);

}
    
}
