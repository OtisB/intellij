package arrayWrapper;

public class ArrayWrapper {
    private int[] array;
    private int elementCount = 0;

    public ArrayWrapper(int arraySize) {
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
     public void add(int element) {
        if (this.elementCount >= this.array.length) {
            int[] newArray = new int[this.array.length * 2];
            System.arraycopy(array, 0, newArray, 0, this.array.length);
            this.array = newArray;
        }
        array[elementCount++] = element;
    }

    /**
     * Method to get access to element as specific index
     * @param index to access specific array position
     * @return integer value of interest
     */
    public int get(int index) {
        return array[index];
    }

    /**
     * Method to see how many elements the array currently holds
     * @return current element in array
     */
    public int getElementCount() {
        return elementCount;
    }
}
