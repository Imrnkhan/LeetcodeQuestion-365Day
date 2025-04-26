package ArrayList_Problem;

import java.util.Arrays;

class CustomArrayList<T> {
    private Object[] elementData;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // Add an element
    public void add(T value) {
        ensureCapacity();
        elementData[size++] = value;
    }

    // Get an element by index
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return (T) elementData[index];
    }

    // Remove element at index
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        elementData[--size] = null; // Avoid memory leak
    }

    // Ensure capacity and resize
    private void ensureCapacity() {
        if (size == elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
    }

    // Display elements
    public void display() {
        System.out.print("CustomArrayList: ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
        System.out.println();
    }

    // Get current size
    public int size() {
        return size;
    }
}

public class CustomArrayListExample {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("After Adding Elements:");
        list.display();

        // Removing an element
        list.remove(1); // Removes "Banana"
        System.out.println("After Removing Element at Index 1:");
        list.display();

        // Adding another element
        list.add("Orange");
        System.out.println("After Adding 'Orange':");
        list.display();

        // Fetch element by index
        System.out.println("Element at index 1: " + list.get(1));

        // Display size
        System.out.println("Current size of list: " + list.size());
    }
}