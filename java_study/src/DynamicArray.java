import java.util.Arrays;

public class DynamicArray<E> {

    private static final int DEFAULT_CAPACITY = 16;

    private int size;

    private Object[] elements;

    public DynamicArray() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= minCapacity) {
            return;
        }

        int newCapacity = oldCapacity * 2;

        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }

        elements = Arrays.copyOf(elements, newCapacity);
    }


    public void add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elements[index] = element;
        return oldValue;
    }

    public void addAll(DynamicArray<? extends E> c) {
        for (int i = 0; i<c.size; i++) {
            add(c.get(i));
        }
    }

    public static<E> int indexOf(DynamicArray<E> arr, Object elm) {
        for (int i = 0; i< arr.size(); i++) {
            if (arr.get(i).equals(elm)) {
                return i;
            }
        }
        return  -1;
    }

}
