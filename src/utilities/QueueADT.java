package utilities;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * QueueADT defines the interface to a queue collection.
 * @param <T> the type of elements held in this collection
 */
public interface QueueADT<T> {
    /**
     * Adds one element to this queue.
     * Pre-condition: none
     * Post-condition: The element is added to the the queue.
     * @param element the element is added to the queue
     */
    public void enqueue(T element) throws NullPointerException;

    /**
     * Removes and returns the element at the front of this queue.
     * Pre-condition: The queue is not empty.
     * Post-condition: The front element is removed from the queue.
     * @return T the element at the front of the queue
     * @throws EmptyCollectionException if queue is empty - NOT IMPLEMENTED
     */
    public T dequeue() throws NoSuchElementException;

    /**
	 * dequeueAll removes all items in the queue.
     * Pre-condition: the queue is not empty.
     * Post-condition: queue is empty.
	 */
	public void dequeueAll();
    
    /**
     * Returns without removing the top element from this queue.
     * Pre-condition: The queue is not empty.
     * Post-condition: The queue remains unchanged.
     * @return T element on top of stack
     * @throws NoSuchElementException if queue is empty.
     */
    public T peek() throws NoSuchElementException;

    /**
	 * Returns an iterator over the elements in this queue in proper sequence.
	 * Pre-condition: The queue is not empty.
     * Post-condition: The queue remains unchanged.
	 * @return an iterator over the elements in this queue in proper sequence.
	 */
	public Iterator<T> iterator();

    /**
     * Returns true if this queue contains no elements.
     * Pre-condition: none
     * Post-condition: The queue remains unchanged.
     * @return boolean whether or not this queue is empty
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in this queue.
     * Pre-condition: The queue is not empty.
     * Post-condition: The queue remains unchanged.
     * @return int the number of elements in the queue
     */
    public int size();
}