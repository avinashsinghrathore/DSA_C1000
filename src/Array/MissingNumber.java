package Array;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 4, 5, 6, 7 };
        int sum = 0;
        int n = 7;
        for (int i = 0; i < n - 1; i++) {
            sum = sum + arr[i];
        }
        int ans = n * (n + 1) / 2 - sum;
        System.out.println("missing number is : " + ans);

    }
}
