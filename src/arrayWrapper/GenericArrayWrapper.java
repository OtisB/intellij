package arrayWrapper;

import java.util.Arrays;

public class GenericArrayWrapper<T> {

    private T[] array;
    private Integer elementCount;

    public GenericArrayWrapper(int arraySize) {
        // Array of Object is cast to T[]
        this.array = (T[]) new Object[arraySize];
        this.elementCount = 0;
    }

    /**
     * Method to get access to element as specific index
     * @param index value to address element in array
     * @return elemnt od type T or null if out of range
     */
    public T get(int index) {
        if (index < array.length)
            return this.array[index];

        return null;
    }

    /**
     * Method to add a new element to array. If array is full array size is doubled
     * @param element new element to add
     */
    public void add(T element) {
        if (this.elementCount >= this.array.length)
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
        this.array[elementCount++] = element;
    }

    /**
     * Method to return current array size
     * @return current array size
     */
    public int getArraySize() {
        return this.array.length;
    }

    /**
     * Method to see how many elements the array currently holds
     * @return current count of elements in array
     */
    public int getElementCount() {
        return elementCount;
    }
}
