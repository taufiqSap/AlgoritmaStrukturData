

public class MaxHeap implements Heap {
    private final PriorityQueue<Integer> pq;

    public MaxHeap() {
        this.pq = new PriorityQueue<>(Comparator.reverseOrder());
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
