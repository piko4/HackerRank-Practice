package javaDataStructures.Q3LinkedLists;


//Create a singly linked list of integers using a Node class.
//         Implement insertion at beginning, insertion at end and insertion at a given position.
//         Implement deletion from beginning, deletion from end and deletion by value.
//         Implement search(), display() and reverse() operations.
//         Display the list after every modification

//------------------------------------
public class SinglyLinkedList
{
    Node head;


    static class Node
    {
        int data;
        Node next;


        private Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFront(int data)
    {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;


    }

    private void insertEnd(int data) // []->[]->null  <-here
    {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                temp.next = new Node(data);
                return;
            }
            temp = temp.next;
        }
    }

    private void insertAfter(int target, int data)
    {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node targetNode = head;
        while (targetNode.data != target)
            targetNode = targetNode.next;

        if (targetNode.data == target) {
            Node newnode = new Node(data);
            newnode.next = targetNode.next;
            targetNode.next = newnode;
            return;
        }


    }

    private void reverse()
    {
        Node previous = null;
        Node currentNode = head;
        Node temp;

        while (currentNode != null)
        {
            temp = currentNode.next;      // Save the next node
            currentNode.next = previous;  // Reverse the link

            previous = currentNode;       // Move previous forward
            currentNode = temp;           // Move to the saved next node
        }

        head = previous;
    }

    private void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");

            temp = temp.next;
        }

        System.out.println("null");
    }

    //------------------------------------M A I N
    public static void main(String[] args)
    {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);
        list.insertEnd(40);
        list.insertEnd(50);
        list.insertAfter(40, 45);
        list.insertAfter(50, 60);
        list.display();
        list.reverse();

        list.display();

    }


}
