package Homeworks;


import java.util.Random;

public class Homework3 {
        Node head;

        static class Node {
            int value;
            Node next;

            Node(int v) {
                value = v;
                next = null;
            }
        }
            private Node reverse(Node node) {
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
                    System.out.printf(" " + node.value);
                    node = node.next;
                }
            }
         public  static Homework3 fillNodes(int qtt, Node head) {

            Homework3 list = new Homework3();
            Random rnd = new Random();
            for (int i = 0; i < qtt; i++) {
                Integer v = rnd.nextInt(100);
                list.head = new Node(v);
                head = head.next;

            }
            return list;
        }


        public static void main(String[] args) {
            Node head = null;
            fillNodes(5, head);

        }


    }

