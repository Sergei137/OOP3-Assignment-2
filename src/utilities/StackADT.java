package utilities;

import java.util.Iterator;
import java.util.EmptyStackException;

/**
 * StackADT defines the interface to a stack collection.
 * @param <T> the type of elements held in this collection
 */
public interface StackADT<T> {
    /**
     * Adds the specified element to the top of this stack.
     * Pre-condition: none
     * Post-condition: The element is added to the top of the stack.
     * @param element generic element to be pushed onto stack
     */
    public void push( T element ) throws NullPointerException;

    /**
     * Removes and returns the top element from this stack.
     * Pre-condition: The stack is not empty.
     * Post-condition: The top element is removed from the stack.
     * @return T element removed from top of stack
     * @throws EmptyStackException if stack is empty.
     */
    public T pop() throws EmptyStackException;

    /**
     * Returns without removing the top element from this stack.
     * Pre-condition: The stack is not empty.
     * Post-condition: The stack remains unchanged.
     * @return T element on top of stack
     * @throws EmptyStackException if stack is empty.
     */
    public T peek() throws EmptyStackException;

    /**
	 * Clears all the items from this Stack.
     * Pre-condition: the stack is not empty.
     * Post-condition: stack is empty.
	 */
	public void clear();

    /**
	 * Returns an iterator over the elements in this stack.
	 * Pre-condition: 
     * Post-condition: 
	 * @return an iterator over the elements in this stack in proper sequence.
	 */
	public Iterator<T> iterator();

    /**
     * Returns true if this stack contains no elements.
     * Pre-condition: none
     * Post-condition: The stack remains unchanged.
     * @return boolean whether or not this stack is empty
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in this stack.
     * Pre-condition: none
     * Post-condition: The stack remains unchanged.
     * @return int number of elements in this stack
     */
    public int size();
}