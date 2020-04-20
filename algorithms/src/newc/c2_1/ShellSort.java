package newc.c2_1;

public class ShellSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        int h = 1;
        while (h < n / 3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                int j = i;
                int min = arr[i];
                for (; j > h && arr[j - h] > min; j -= h) {
                    arr[j] = arr[j - h];
                }
                arr[j] = min;
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        int[] arr = SortTestHelper.generateRandomArray(10000, 0, 10000);
        SortTestHelper.testSort("newc.c2_1.ShellSort", arr);
        SortTestHelper.printAll(arr);
    }

}
