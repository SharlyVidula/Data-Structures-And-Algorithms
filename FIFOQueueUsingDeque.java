import java.util.Deque;
import java.util.LinkedList;

public class FIFOQueueUsingDeque {
    private Deque<Integer> deque = new LinkedList<>();

    public void enqueue(int data) {
        deque.addLast(data);
    }

    public int dequeue() {
        if (deque.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return deque.removeFirst();
    }
}

