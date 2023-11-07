package utilities;

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
    void push(T element);

    /**
     * Removes and returns the top element from this stack.
     * Pre-condition: The stack is not empty.
     * Post-condition: The top element is removed from the stack.
     * @return T element removed from top of stack
     * @throws EmptyCollectionException if stack is empty - NOT IMPLEMENTED
     */
    T pop();

    /**
     * Returns without removing the top element of this stack.
     * Pre-condition: The stack is not empty.
     * Post-condition: The stack remains unchanged.
     * @return T element on top of stack
     * @throws EmptyCollectionException if stack is empty - NOT IMPLEMENTED
     */
    T peek();

    /**
     * Returns true if this stack contains no elements.
     * Pre-condition: none
     * Post-condition: The stack remains unchanged.
     * @return boolean whether or not this stack is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this stack.
     * Pre-condition: none
     * Post-condition: The stack remains unchanged.
     * @return int number of elements in this stack
     */
    int size();
}