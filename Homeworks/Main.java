import java.util.Random;

public class Main {

    static Node head;
    Node current;

    static class Node extends Main {
        int value;
        Node next;


        Node(int v) {
            value = v;
            next = null;
        }
    }

    private static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void printList(Node node) {
        while (node != null) {
            if (node == head) {
                System.out.printf(" " + node.value);
            } else {
                System.out.printf(" -> " + node.value);
            }
            node = node.next;
        }
    }

    public static void fillNodes(int qtt) {

        Main list = new Main();
        Random rnd = new Random();

        head = new Node(rnd.nextInt(100));
        list.current = head;
        for (int i = 0; i < qtt - 1; i++) {
            int v = rnd.nextInt(100);
            list.current.next = new Node(v);
            list.current = list.current.next;

        }
    }

    public static void main(String[] args) {
        fillNodes(12);
        System.out.println("Randomly generated list below:");
        printList(head);
        System.out.println("");
        head = reverse(head);
        System.out.println("Reversed list below:");
        printList(head);
    }
}


