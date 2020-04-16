package c1_4;

import java.util.Random;

public class Stopwatch {

    private final long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public static void main(String[] args) {
        int N = 5000;
        int[] a = new int[N];
        int min = -100000;
        int max = 100000;
        for (int i = 0; i < N; i++) {
            a[i] = min + (int) (Math.random() * (max - min + 1));
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapsedTime();
        System.out.println(cnt + " triples " + time + " seconds");
    }
}
