import java.util.*;
class linkedlist{
    Node head;
    public class Node{
        int num;
        Node next;
        Node(){};
        Node(int num){
            this.num=num;
        }
        Node(int num,Node next){
            this.num=num;
            this.next=next;
        }
    }
    public void addFirst(int num){
        Node newnode=new Node(num);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int num){
        Node newnode=new Node(num);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next; 
        }
        currNode.next=newnode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void printlist(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.num+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        linkedlist obj=new linkedlist();
        obj.addFirst(sc.nextInt());
        obj.addFirst(sc.nextInt());
        obj.printlist();
        obj.addLast(sc.nextInt());
        obj.printlist();
        obj.addFirst(sc.nextInt());
        obj.printlist();
        obj.deleteFirst();
        obj.printlist();
        obj.deleteLast();
        obj.printlist();
    }
}