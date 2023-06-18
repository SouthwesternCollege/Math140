package lab6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue<Item> implements Iterable<Item> {
    private static final int CAPACITY = 8;
    private Item[] array;
    private int n;
    private int first;
    private int last;

    public ArrayQueue() {
        array = (Item[]) new Object[CAPACITY];
        n = 0;
        first = 0;
        last = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        if (n == array.length) {
            resize(2 * array.length);
        }
        array[last++] = item;
        if(last == array.length) {
            last = 0;
        }
        n++;
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        Item item = array[first];
        array[first] = null;
        first++;
        if(first == array.length) {
            first = 0;
        }
        n--;
        if (0 < n && n <= array.length / 4) {
            resize(array.length / 2);
        }
        return item;
    }

    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = array[first + i % array.length];
        }
        array = copy;
        first = 0;
        last = n;
    }

    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i < n;
            }

            @Override
            public Item next() {
                if (hasNext()){
                    Item item = array[first + i % array.length];
                    i++;
                    return item;
                }
                throw new NoSuchElementException("No such item");
            }
        };
    }
}
