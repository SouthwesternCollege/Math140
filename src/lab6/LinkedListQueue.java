package lab6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListQueue<Item> implements Iterable<Item>{
    private class Node {
        private Item item;
        private Node next;
    }

    private Node first;
    private Node last;
    private int n;

    public LinkedListQueue() {
        first = null;
        last = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if(isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        n++;
    }

    public Item dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public Iterator<Item> iterator() {
        return new Iterator<>() {
            Node current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                if(hasNext()){
                    Item item = current.item;
                    current = current.next;
                    return item;
                }
                throw new NoSuchElementException("No such element");
            }
        };
    }
}
