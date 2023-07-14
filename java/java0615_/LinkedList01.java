package java0615_;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");
        jack.next = tom;
        tom.next = hsp;
        hsp.pre = tom;
        tom.pre = jack;
        Node first = jack;
        Node last = hsp;
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        Node smith = new Node("smith");
        smith.next = hsp;
        smith.pre = tom;
        hsp.pre = smith;
        tom.next = smith;
        first=jack;
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name=" + item;
    }
}