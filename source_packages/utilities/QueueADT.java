package utilities;

/**
 * QueueADT defines the interface to a queue collection.
 * @param <T> the type of elements held in this collection
 */
public interface QueueADT<T> {
    /**
     * Adds one element to the rear of this queue.
     * Pre-condition: none
     * Post-condition: The element is added to the rear of the queue.
     * @param element the element to be added to the rear of the queue
     */
    void enqueue(T element);

    /**
     * Removes and returns the element at the front of this queue.
     * Pre-condition: The queue is not empty.
     * Post-condition: The front element is removed from the queue.
     * @return T the element at the front of the queue
     * @throws EmptyCollectionException if queue is empty - NOT IMPLEMENTED
     */
    T dequeue();

    /**
     * Returns without removing the element at the front of this queue.
     * Pre-condition: The queue is not empty.
     * Post-condition: The queue remains unchanged.
     * @return T the first element in the queue
     * @throws EmptyCollectionException if queue is empty - NOT IMPLEMENTED
     */
    T first();

    /**
     * Returns true if this queue contains no elements.
     * Pre-condition: none
     * Post-condition: The queue remains unchanged.
     * @return boolean whether or not this queue is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this queue.
     * Pre-condition: none
     * Post-condition: The queue remains unchanged.
     * @return int the number of elements in the queue
     */
    int size();
}