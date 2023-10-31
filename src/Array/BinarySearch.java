package Array;

import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("Enter the target element you want to find : ");
        int target = sc.nextInt();
        System.out.println("element found at pos : " + binarySearch(arr, target));
    }

}
