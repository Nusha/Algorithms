package Lectures;

import java.util.LinkedList;
import java.util.List;

public class Tree_lecture {
    Node root;

    public class Node extends Tree_lecture {
        int value;
        List<Node> children;
    }

    public boolean exist(int value) {
        if (root != null) {
            Node node = find(root, value);
            if (node != null) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private Node find(Node node, int value) {
        if (node.value == value) {
            return node;
        } else {
            for (Node child : node.children) {
                Node result = find(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
    private Node findWidth(int value) {
        List<Node> line = new LinkedList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextline = new LinkedList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextline.addAll(node.children);
            }
            line = nextline;
        }
        return null;
    }
}
