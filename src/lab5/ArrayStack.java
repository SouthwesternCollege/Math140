package lab5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<Item> implements Iterable<Item> {
    private static final int CAPACITY = 8;
    private Item[] array;
    private int n;

    public ArrayStack() {
        array = (Item[]) new Object[CAPACITY];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        if (n == array.length) {
            resize(2 * array.length);
        }
        array[n] = item;
        n++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        Item item = array[n - 1];
        array[n - 1] = null;
        n--;
        if (0 < n && n <= array.length / 4) {
            resize(array.length / 2);
        }
        return item;
    }

    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = array[i];
        }
        array = copy;
    }

    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<Item> {
        int i = n - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Item next() {
            if(hasNext()) {
                return array[i--];
            }
            throw new NoSuchElementException("No such item");
        }
    }
}