import java.util.LinkedList;

public class ListStack<T> {
    private LinkedList<T> stack;

    public ListStack() {
        stack = new LinkedList<>();
    }

    // Push element onto stack
    public void push(T item) {
        stack.addFirst(item);
    }

    // Pop element from stack
    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
        return stack.removeFirst();
    }

    // Peek top element
    public T peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return null;
        }
        return stack.getFirst();
    }

    // Check if empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get size
    public int size() {
        return stack.size();
    }

    // Display stack
    public void display() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        ListStack<Integer> stack = new ListStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // Stack: [30, 20, 10]

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Peek: " + stack.peek());   // 20

        stack.display(); // Stack: [20, 10]
    }
}
