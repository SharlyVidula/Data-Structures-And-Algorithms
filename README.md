# Java Data Structures & Sorting Algorithms

This project contains implementations of **fundamental data structures** and **sorting algorithms** in Java.  
It is designed for learning and demonstration purposes — showcasing both stack/queue concepts and basic sorting techniques.

---

## 📂 Contents

### 1. **Stack Implementations**
#### 1.1 ArrayStack
- Uses an array to store elements.
- Follows **LIFO** (Last In First Out) principle.
- Key operations:
  - `push(element)` → Adds element to the top.
  - `pop()` → Removes and returns the top element.
  - `peek()` → Returns the top element without removing.
  - `isEmpty()` → Checks if stack is empty.

---

### 2. **Queue Implementations**
#### 2.1 FIFO Queue using Deque
- Implements **FIFO** (First In First Out) using `Deque` from Java's `java.util` package.
- Key operations:
  - `enqueue(element)` → Adds element to the rear.
  - `dequeue()` → Removes and returns the front element.
  - `peek()` → Views the front element.
  - `isEmpty()` → Checks if empty.

#### 2.2 StackQueue (Queue using Two Stacks)
- Simulates a queue using **two stacks**.
- Enqueue → Push to stack1.
- Dequeue → If stack2 is empty, move all elements from stack1 to stack2, then pop.

#### 2.3 ListQueue
- Implements a queue using **Linked List**.
- Key operations:
  - `enqueue(element)` → Adds element to the rear.
  - `dequeue()` → Removes from the front.
  - `isEmpty()` → Checks if queue is empty.

---

### 3. **Sorting Algorithms**
#### 3.1 Bubble Sort
- Repeatedly swaps adjacent elements if they are in the wrong order.
- Time Complexity:
  - Best: O(n)
  - Worst: O(n²)

#### 3.2 Insertion Sort
- Builds the sorted array one element at a time.
- Time Complexity:
  - Best: O(n)
  - Worst: O(n²)

#### 3.3 Selection Sort
- Finds the smallest element and swaps it with the first unsorted element.
- Time Complexity:
  - Best/Worst: O(n²)

---

## 📦 How to Run
1. Clone or download this repository.
2. Compile the `.java` files:
   ```bash
   javac ArrayStack.java FifoQueueDeque.java StackQueue.java ListQueue.java BubbleSort.java InsertionSort.java SelectionSort.java
