package arrayWrapper;

public class ArrayWrapper {
    private int[] array;
    private int elementCount = 0;

    public ArrayWrapper(int arraySize) {
        this.array = new int[arraySize];
    }

    public int getArraySize() {
        return this.array.length;
    }

     public void add(int element) {
        if (this.elementCount >= this.array.length) {
            int[] newArray = new int[this.array.length * 2];
            System.arraycopy(array, 0, newArray, 0, this.array.length);
            this.array = newArray;
        }
        array[elementCount++] = element;
    }

    public int get(int index) {
        return array[index];
    }

    public int getElementCount() {
        return elementCount;
    }
}
