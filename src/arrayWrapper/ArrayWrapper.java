package arrayWrapper;

import java.util.Arrays;

public class ArrayWrapper<T> {
    private int[] array;
    private int elementCount = 0;

    public ArrayWrapper(Integer arraySize) {
        this.array = new int[arraySize];
    }

    /**
     * Method to return current array size
     * @return current array size
     */
    public int getArraySize() {
        return this.array.length;
    }

    /**
     * Method to add a new element to array. If array is full array size is doubled
     * @param element to add
     */
     public void add(Integer element) {
        if (this.elementCount >= this.array.length)
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
        this.array[elementCount++] = element;
    }

    /**
     * Method to get access to element as specific index
     * @param index to access specific array position
     * @return integer value of interest
     */
    public int get(Integer index) {
        return array[index];
    }

    /**
     * Method to see how many elements the array currently holds
     * @return current count of elements in array
     */
    public int getElementCount() {
        return elementCount;
    }
}
