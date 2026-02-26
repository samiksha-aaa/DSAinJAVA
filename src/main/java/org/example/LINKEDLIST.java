package org.example;

class sll {
     static class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }

         Node head;

         public void insertatbegin(int data) {
             Node newnode = new Node(data);
             newnode.next = head;
             head = newnode;
         }

         public void insertatend(int data) {
             Node newnode = new Node(data);
             if (head == null) {
                 return;
             }
             Node temp = head;
             while (temp.next != null) {
                 temp = temp.next;
             }
             temp.next = newnode;
         }
     // Delete from beginning
     public void deleteFromBeginning() {
         if (head == null) {
             System.out.println("List is empty");
             return;
         }

         head = head.next;
     }

     public void display(){
             Node temp=head;
             while(temp!=null){
                 System.out.print(temp.data+"->");
                 temp=temp.next;
             } System.out.println("null");
         }
    public static void main(String[] args) {
        sll sll=new sll();
        sll.insertatbegin(10);
        sll.insertatend(20);
        sll.insertatend(30);
        sll.insertatend(40);
        System.out.println("linked list: ");
        sll.display();
        System.out.println("linked list after inserting at beginning: ");
        sll.insertatbegin(50);
       sll.display();
       System.out.println("linked list after deleting an element: ");
sll.deleteFromBeginning();
sll.display();
    }
}