package newc.c2_1;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            for (; j > 0 && (arr[j - 1] > temp); j--) {
                arr[j] = arr[j - 1];
                //SelectionSort.swap(arr, j - 1, j);
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] testArr = SortTestHelper.generateRandomArray(10000, 0, 10000);
        int[] testNearlyArr = SortTestHelper.generateNearlyOrderedArray(10000, 10);
        int[] testArr2 = Arrays.copyOf(testArr, testArr.length);
        //选择排序
        SortTestHelper.testSort("newc.c2_1.SelectionSort", testArr);
        SortTestHelper.printAll(testArr);
        //插入排序
        SortTestHelper.testSort("newc.c2_1.InsertionSort", testArr2);
        SortTestHelper.printAll(testArr2);
        //近乎有序的插入排序
        SortTestHelper.testSort("newc.c2_1.InsertionSort", testNearlyArr);
        SortTestHelper.printAll(testNearlyArr);

    }

}
