import java.util.*;
class mergesort{
    ListNode head;
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public void mergetwo(ListNode l1,ListNode l2){
        ListNode head=new ListNode(0);
        ListNode temp=head;
        if(l1==null){
            System.out.print(l2);
        }
        if(l2==null){
            System.out.print(l1);
        }
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            temp.next=l2;
            l2=l2.next;
            temp=temp.next;
        }
        System.out.print(head.next+"->");
    }
    public void printlist(){
        ListNode curNode=new ListNode();
        curNode=head;
        while(curNode!=null){
            System.out.print(curNode.val+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    }
}

