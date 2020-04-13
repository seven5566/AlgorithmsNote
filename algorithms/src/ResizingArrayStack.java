import java.util.Iterator;
import java.util.Spliterator;

public class ResizingArrayStack implements Iterable<String> {
    private String[] a = new String[1];
    private int N;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        String[] temp = new String[max];
        System.arraycopy(temp, 0, a, 0, N);
        a = temp;
    }

    public void push(String item) {
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public String pop() {
        String item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    @Override
    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }

    private class ReverseArrayIterator implements Iterator<String> {

        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public String next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
