package CodeSchool;

public class HashMap {
    public LinkedList1[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedList1[size];
        for (int i = 0; i < size; i++) {
            this.hashmap[i] = new LinkedList1();
        }
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        LinkedList1 list = this.hashmap[arrayIndex];
        if (list.head2 == null) {
            list.addToHead(key, value);
            return;
        }
        Node2 current = list.head2;
        while (current != null) {
            if (current.key == key) {
                current.setKeyValue(key, value);
            }
            if (current.getNextNode() == null) {
                current.setNextNode(new Node2(key, value));
                break;
            }
            current = current.getNextNode();
        }
    }

//    public String retrieve(String key) {
//        int arrayIndex = this.hash(key);
//        Node current = this.hashmap[arrayIndex].head2;
//        while (current != null) {
//            if (current.key == key) {
//                return current.value;
//            }
//            current = current.getNextNode();
//        }
//        return null;
//    }

    public static void main(String[] args) {
        HashMap birdCensus=new HashMap(15);
        birdCensus.assign("mandarin duck","Central Park Pond");
        birdCensus.assign("monk parakeet","Brooklyn College");
        birdCensus.assign("horned owl","Pelham Bay Park");
//      ln(birdCensus.retrieve("horned owl"));
    }
}
