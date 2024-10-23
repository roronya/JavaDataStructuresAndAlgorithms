import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // WRITE THE SINKDOWN METHOD HERE //
    public void sinkDown(int index) {
        if (index > heap.size() - 1) {
            return;
        }

        while(true) {
            var current = heap.get(index);
            var leftIndex = leftChild(index);
            var rightIndex = rightChild(index);
            if (leftIndex >= heap.size() || heap.get(leftIndex) <= current) {
                return;
            }
            var maxValueIndex = leftIndex;
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxValueIndex)) {
                maxValueIndex = rightIndex;
            }
            swap(index, maxValueIndex);
            index = maxValueIndex;
        }
    }


    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return maxValue;
    }

}
