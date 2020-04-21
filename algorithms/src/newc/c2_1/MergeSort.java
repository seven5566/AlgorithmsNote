package newc.c2_1;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr) {
        sortInternal(arr, 0, arr.length - 1);
    }

    private static void sortInternal(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        sortInternal(arr, l, mid);
        sortInternal(arr, mid + 1, r);
        if (arr[mid] > arr[mid + 1])
            merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] aux = Arrays.copyOfRange(arr, l, r + 1);
        int i = l;
        int j = mid + 1;
        for (int k = l; k < r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] > aux[j - l]) {
                arr[k] = aux[j - l];
                j++;
            } else if (aux[i - l] <= aux[i - l]) {
                arr[k] = aux[i - l];
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = SortTestHelper.generateRandomArray(10000, 0, 10000);
        SortTestHelper.testSort("newc.c2_1.MergeSort", testArray);
        SortTestHelper.printAll(testArray);
    }

}
