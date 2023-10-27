package Array;

import java.util.Scanner;

public class SecondMax {
    static void SecondMaxEle (int arr[]) {
        int max = 0;
        int smax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,8,12,21,15};
        System.out.print("second max is : ");
        SecondMaxEle(arr);
    }
}
