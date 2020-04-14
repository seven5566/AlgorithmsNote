package linked;

import java.util.Iterator;

public class LinkedQueue implements Iterable<String> {

    private Node first;
    private Node last;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(String msg) {
        Node oldLast = last;
        last = new Node();
        last.item = msg;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public String dequeue() {
        String msg = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return msg;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
