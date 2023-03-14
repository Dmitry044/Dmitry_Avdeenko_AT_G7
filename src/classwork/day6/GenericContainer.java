package classwork.day6;

public class GenericContainer<T> {
    T[] array = (T[])new Object[10];
    int emptyPosition = 0;

    public void add(T incoming) {
        if (emptyPosition < array.length) {
            array[emptyPosition++] = incoming;
        }
    }

    public T removeLast() {
        T removedObject = null;
        if (emptyPosition != 0) {
            removedObject = array[emptyPosition - 1];
            array[emptyPosition-- - 1] = null;
            return removedObject;
        }
        return removedObject;
    }

    public boolean isEmpty() {
        return emptyPosition == 0;
    }


}
