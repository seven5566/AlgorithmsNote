package c1_4;

public class ThreeSumFast {

    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (TwoSumFast.binarySearch(a, -a[i] - a[j]) > j) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
