package org.example;

public class CIRCULARLINKEDLIST {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    public void insertatbeginning(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
          newnode.next=head;
            temp.next=newnode;
            head=newnode;
    }
    public void insertatend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            } temp.next=newnode;
            newnode.next=head;
    }
    public void delete(){
        if(head==null){
            System.out.println("no linked list");
            return;
        }Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
    }
    public void display(){
        if(head==null){
            System.out.println("no linked list");
            return;
        }
        Node temp=head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
    public static void main(String[] args) {
CIRCULARLINKEDLIST cll=new CIRCULARLINKEDLIST();
cll.insertatend(1);
    cll.insertatend(2);
    cll.insertatend(3);
    cll.insertatend(4);
    cll.insertatend(5);
    System.out.println("the list is:");
    cll.display();
    System.out.println("the list after inserting from beginning:");
    cll.insertatbeginning(6);
    cll.display();
    System.out.println("the list after deleting from beginning:");
    cll.delete();
    cll.display();
    }
}
