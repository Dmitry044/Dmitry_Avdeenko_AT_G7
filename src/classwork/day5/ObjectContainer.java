package classwork.day5;

public class ObjectContainer {

    Object[] array = new Object[10];
    int emptyPosition = 0;

    public void add(Object incoming) {
        if (emptyPosition < array.length) {
            array[emptyPosition++] = incoming;
        }
    }

    public Object removeLast() {
        Object removedObject = null;
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
