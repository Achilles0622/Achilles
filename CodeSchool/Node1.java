package CodeSchool;

public class Node1 {
    public String data;
    private Node1 next;
    private Node1 previous;

    public Node1(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node1 node1) {
        this.next = node1;
    }

    public void setPreviousNode(Node1 node1) {
        this.previous = node1;
    }

    public Node1 getNextNode() {
        return this.next;
    }

    public Node1 getPreviousNode() {
        return this.previous;
    }}