
public class MaxHeap {

    private int[] Heap;
    private int size;
    private int maxsize;
    private static final int FRONT = 1;

    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        /*if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;*/
        return pos >= (size / 2) && pos <= size;
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] =  tmp;
    }

    private void maxHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int element) {
        Heap[++size] = element;
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current =  parent(current);
        }
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(
                    " valor padre : " + Heap[i]
                    + " hijo izquierdo : " + Heap[2 * i]
                    + " hijo derecho :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    public void maxHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) {
            maxHeapify(pos);
        }
    }

    public int extractMax() {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        maxHeapify(FRONT);
        return popped;
    }

    public static void main(String[] args) {
        System.out.println(" Consultando el valor máximo:");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(15);
        maxHeap.insert(36);
        maxHeap.insert(0);
        maxHeap.insert(18);
        maxHeap.insert(84);
        maxHeap.insert(79);
        maxHeap.insert(65);
        maxHeap.insert(0);
        maxHeap.insert(19);
        maxHeap.maxHeap();
        maxHeap.print();
        System.out.println("El valor máximo es: " + maxHeap.extractMax()); // consultamos y extraemos el máximo
    }
}
