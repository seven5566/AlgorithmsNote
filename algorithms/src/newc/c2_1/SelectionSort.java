package newc.c2_1;

/**
 * 选择排序
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] testArray = SortTestHelper.generateRandomArray(100000, 0, 100000);
        SortTestHelper.testSort("newc.c2_1.SelectionSort", testArray);
        SortTestHelper.printAll(testArray);
    }

}
