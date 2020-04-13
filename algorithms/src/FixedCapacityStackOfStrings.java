public class FixedCapacityStackOfStrings {

    private String[] a;
    private int N = 0;

    public FixedCapacityStackOfStrings(int n) {
        a = new String[n];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return a.length;
    }

    public void push(String item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    public String pop() {
        String temp = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return temp;
    }

    private void resize(int max) {
        String[] temp = new String[max];
        System.arraycopy(a, 0, temp, 0, N);
        a = temp;
    }

    public static void main(String[] args) {
        /*FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");*/
        int i = 10;
        System.out.println(--i);
        System.out.println(i);
    }

}
