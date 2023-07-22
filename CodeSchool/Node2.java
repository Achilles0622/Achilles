package CodeSchool;

public class Node2 {
    public String key;
    public String value;
    private Node2 next;

    public Node2(String key, String value) {
        this.key  = key;
        this.value = value;
        this.next = null;
    }

    public void setNextNode(Node2 node2) {
        this.next = node2;
    }

    public Node2 getNextNode() {
        return this.next;
    }

    public void setKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
