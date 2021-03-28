/**
 * A small queue interface. You can query the size of the queue and ask whether
 * it is empty, add and remove items, and peek at the front item.
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Mar. 28, 2021
 */

public interface Queue<T> {

    /**
     * Adds the given item to the rear of the queue.
     */
    void enqueue(T item);

    /**
     * Removes the front item from the queue and returns it.
     * 
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T dequeue();

    /**
     * Returns the front item from the queue without popping it.
     * 
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T peek();

    /**
     * Returns the number of items currently in the queue.
     */
    int size();

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty();
}


