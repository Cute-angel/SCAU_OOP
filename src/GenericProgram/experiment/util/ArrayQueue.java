package GenericProgram.experiment.util;

public class ArrayQueue<T> {
    private int capacity;
    private T[] queue;
    private int p = 0;
    private int head = 0;
    private int size = 0;

    public ArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }

        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
    }

    public ArrayQueue() {
        this.capacity = 16;
        this.queue = (T[]) new Object[16];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void add(T item) {
        if (!isFull()) {
            queue[p++] = item;
            size++;
            p = p % capacity;
        } else {
            throw new IllegalStateException("Queue is full");
        }
    }

    public T remove() {
        if (!isEmpty()) {
            size--;
            T item = queue[head];
            head = (head + 1) % capacity;
            return item;
        }
        throw new IllegalStateException("Queue is empty");
    }
}
