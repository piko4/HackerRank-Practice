package javaDataStructures.Q5StackByLinked;

//          Implement a stack using a linked list. Provide push(), pop(), peek() and display().
//          Implement a queue using a linked list. Provide enqueue(), dequeue(), front() and display().
//          Do not use java.util.Stack, Queue, LinkedList or ArrayDeque for the actual data-structure implementation.
//          State the time complexity of each insertion and deletion operation
public class StackByLinked
{
    Node top;

    class Node
    {
        int data;
        Node next;

        private Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int data)
    {
        if(top==null)
        {
            top=new Node(data);
            return;
        }

        Node node=new Node(data);
        node.next=top;
        top=node;
    }
    private void pop()
    {
        top=top.next;
    }

    private void peek()
    {
        System.out.println(top.data);
    }


    public static void main(String[] args)
    {
        StackByLinked stack=new StackByLinked();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.peek();
    }


}
