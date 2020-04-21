package newc.c2_1;

public class MergeBUSort {

    public static void sort(int[] arr) {
        for (int sz = 1; sz < arr.length; sz *= 2) {
            for (int i = 0; i < arr.length - sz; i += 2 * sz) {
                MergeSort.merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, arr.length - 1));
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = SortTestHelper.generateRandomArray(10000, 0, 10000);
        SortTestHelper.testSort("newc.c2_1.MergeBUSort", testArray);
        SortTestHelper.printAll(testArray);
    }

}
