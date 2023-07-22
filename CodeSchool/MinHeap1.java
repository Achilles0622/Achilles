package CodeSchool;
import java.util.ArrayList;
public class MinHeap1 {
    public ArrayList<Integer> heap;
    public int size;

    public MinHeap1() {
        this.heap = new ArrayList<Integer>();
        this.size = 0;
        this.heap.add(null);
    }

    public static void main(String[]args) {
        MinHeap minHeap = new MinHeap();
        System.out.println(minHeap.heap);
    }

}
