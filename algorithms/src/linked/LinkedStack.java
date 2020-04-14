package linked;

import java.util.Iterator;

public class LinkedStack implements Iterable<String> {

    private Node first;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(String msg) {
        Node oldFirst = first;
        first = new Node();
        first.item = msg;
        first.next = oldFirst;
        N++;
    }

    public String pop() {
        String result = first.item;
        first = first.next;
        return result;
    }

    @Override
    public Iterator<String> iterator() {
        return new LinedStackIterator();
    }

    private class LinedStackIterator implements Iterator<String> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String result = first.item;
            current = current.next;
            return result;
        }
    }

}
