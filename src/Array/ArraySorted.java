package Array;

import java.util.Scanner;

public class ArraySorted {

    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 33, 50, 50 };
        System.out.print(isSorted(arr));

    }
}
