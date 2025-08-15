import java.util.Deque;
import java.util.ArrayDeque;

public class FIFOQueueUsingDeque {
    public static void main(String[] args) {
        // Create a Deque to act as a FIFO Queue
        Deque<Integer> queue = new ArrayDeque<>();

        // Enqueue elements (add to the back)
        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);

        System.out.println("Queue after adding elements: " + queue);

        // Dequeue elements (remove from the front)
        System.out.println("Removed: " + queue.removeFirst());
        System.out.println("Removed: " + queue.removeFirst());

        System.out.println("Queue after removing elements: " + queue);

        // Peek front element without removing
        System.out.println("Front element: " + queue.peekFirst());
    }
}
