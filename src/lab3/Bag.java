package lab3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item>{
    private static final int CAPACITY = 8;
    private Item[] array;
    private int n;

    public Bag() {
        array = (Item[]) new Object[CAPACITY];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void add(Item item) {
        if (n == array.length) {
            resize(2 * array.length);
        }
        array[n] = item;
        n++;
    }

    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = array[i];
        }
        array = copy;
    }

    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {
        private int i = 0;
        public void remove() {
        }
        public boolean hasNext() {
            return i < n;
        }
        public Item next() {
            if(hasNext())
                return array[i++];
            throw new NoSuchElementException();
        }
    }

}
