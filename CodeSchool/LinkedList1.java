package CodeSchool;

public class LinkedList1 {
    public Node2 head2;

    public LinkedList1() {
        this.head2 = null;
    }

    public void addToHead(String key, String value) {
        Node2 newHead = new Node2(key, value);
        Node2 currentHead = this.head2;
        this.head2 = newHead;
        if (currentHead != null) {
            this.head2.setNextNode(currentHead);
        }
    }

    public void addToTail(String key, String value) {
        Node2 tail = this.head2;
        if (tail == null) {
            this.head2 = new Node2(key, value);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node2(key, value));
        }
    }

    public void removeHead() {
        Node2 removedHead = this.head2;
        if (removedHead == null) {
            return;
        }
        this.head2 = removedHead.getNextNode();
    }
}
