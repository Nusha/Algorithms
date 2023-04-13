package Lectures;

public class Stackex {
    Node head;
    Node tail;

    public void push(int value) {
         Node node = new Node();
         node.value = value;
         node.next = head;
         head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }
}
