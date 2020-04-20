package newc.c2_1;

public class BubbleSort {

    public static int[] sort(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 时间在207ms
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = SortTestHelper.generateRandomArray(10000, 0, 10000);
        SortTestHelper.testSort("newc.c2_1.BubbleSort", arr);
        SortTestHelper.printAll(arr);
    }

}
