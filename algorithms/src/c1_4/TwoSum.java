package c1_4;

public class TwoSum {

    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                        cnt++;
                }
            }
        }
        return cnt;
    }
}
