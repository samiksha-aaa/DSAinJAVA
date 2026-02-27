package org.example;

public class DOUBLELINKEDLIST {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node head;
    public void insertatbegin(int data){
        Node newnode=new Node(data);
        if(head!=null){
            newnode.next=head;
            head.prev=newnode;
        }  head=newnode;
    }
    public void insertatend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }  Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
    public void deletefrombegin(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
         System.out.print(temp.data+ "->");
         temp=temp.next;
        } System.out.println("null");
    }
    public static void main(String[] args) {
        DOUBLELINKEDLIST dll=new DOUBLELINKEDLIST();
        dll.insertatbegin(10);
        dll.insertatend(20);
        dll.insertatend(30);
        System.out.println("double linked list:");
        dll.display();
        System.out.println("double linked list after deleting from beginning:");
        dll.deletefrombegin();
        dll.display();
        System.out.println("double linked list after inserting from beginning:");
        dll.insertatbegin(40);
        dll.display();
    }
}
