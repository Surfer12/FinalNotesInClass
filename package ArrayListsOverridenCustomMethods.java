package FinalNotesInClass;

/**
 * 
 * The MyArrayList class represents a custom implementation of an ArrayList.
 * It provides methods to add, remove, get, set, and manipulate elements in the
 * list.
 * The class uses an underlying array to store the elements and dynamically
 * resizes the array when needed.
 * The size of the list is automatically adjusted as elements are added or
 * removed.
 *
 * @param <E> the type of elements stored in the list
 */
public class MyArrayList<E> {
    private E[] data;
    private int size;
    private int capacity;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        capacity = 10;
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * Adds an element to the end of the list.
     * If the array is full, it will ensure capacity is increased.
     *
     * @param element the element to be added
     */
    public void add(E element) {
        if (size == capacity) {
            ensureCapacity();
        }
        data[size++] = element;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     * @throws NullPointerException      if the element is null
     */
    public void add(int index, E element) {
        checkIndex(index);
        checkElementPointer(element);
        if (size == capacity) {
            ensureCapacity();
        }
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     * @throws NullPointerException      if the element is null
     */
    public E set(int index, E element) {
        checkIndex(index);
        checkElementPointer(element);
        E oldElement = data[index];
        data[index] = element;
        return oldElement;
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E remove(int index) {
        checkIndex(index);
        E removedElement = data[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(data, index + 1, data, index, numMoved);
        }
        data[--size] = null;
        return removedElement;
    }

    /**
     * Returns true if this list contains the specified element.
     *
     * @param element element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * @throws NullPointerException if the element is null
     */
    public boolean contains(E element) {
        checkElementPointer(element);
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     *
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     * @throws NullPointerException if the element is null
     */
    public int indexOf(E element) {
        checkElementPointer(element);
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    /**
     * Increases the capacity of this MyArrayList instance, if necessary, to
     * ensure that it can hold at least the number of elements specified by
     * the minimum capacity argument.
     */
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size == capacity) {
            int newCapacity = capacity * 2;
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
            capacity = newCapacity;
        }
    }

    /**
     * Checks if the given index is in range. If not, throws an appropriate
     * runtime exception. This method does *not* check if the index is
     * negative: It is always used immediately prior to an array access,
     * which throws an ArrayIndexOutOfBoundsException if index is negative.
     *
     * @param index the index to check
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Checks if the element is not null.
     *
     * @param element the element to check
     * @throws NullPointerException if the element is null
     */
    private void checkElementPointer(E element) {
        if (element == null) {
            throw new NullPointerException("Element is null");
        }
    }
}
