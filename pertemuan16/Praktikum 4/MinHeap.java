public class MinHeap implements Heap {

    private final PriorityQueue<Integer> pq;

    public MinHeap() {
        this.pq = new PriorityQueue<>();
    }

    @Override
    public int getSize() {
        return pq.size();
    }

    @Override
    public boolean isEmpty() {
        return pq.isEmpty();
    }

    @Override
    public void insert(int element) {
        pq.add(element);
    }

    @Override
    public int extractRoot() {
        return pq.remove();
    }
}