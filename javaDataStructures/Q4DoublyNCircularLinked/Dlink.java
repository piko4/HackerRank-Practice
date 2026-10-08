package javaDataStructures.Q4DoublyNCircularLinked;

//Part A: Implement a doubly linked list with insert-at-end,
// delete-by-value,forward display and backward display.

public class Dlink
{
    Node head;

    class Node
    {
        Node prev;
        int data;
        Node next;

        public Node(int data)
        {
            this.prev = null;
            this.data = data;
            this.next = null;
        }

    }


    private void insertEnd(int data)
    {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node currentNode=head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        if (currentNode.next==null){
            currentNode.next=new Node(data);
            return;
        }
    }

    private void insertFront(int data)
    {
        if(head==null){
            head=new Node(data);
            return;
        }

        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    private void display()
    {
        Node currrent=head;
        while (currrent!=null)
        {
            System.out.print(currrent.data+"<->");
            currrent=currrent.next;
            if (currrent==null)
                break;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Dlink dllist = new Dlink();
        dllist.insertEnd(10);
        dllist.insertEnd(20);
        dllist.insertEnd(30);
        dllist.insertFront(5);
        dllist.display();
    }




}
