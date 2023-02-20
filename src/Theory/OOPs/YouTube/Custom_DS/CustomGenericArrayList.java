package Theory.OOPs.YouTube.Custom_DS;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    // Constructor:
    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    // Recurred Implementation:
    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // Copying the current items in the new array:
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    // Methods:
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public T remove(){
        T remove = (T) data[--size];
        return remove;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return data.length;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList {\n" +
                "   data = " + Arrays.toString(data) +
                ",\n   size = " + size +
                "\n}";
    }
}
