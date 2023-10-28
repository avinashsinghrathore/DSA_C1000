package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RotateBy1 {
    static void rotateByOneFun(int arr[], int n) {
        int temp = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            arr[i + 1] = arr[i];
            
        }
        arr[0] = temp;
        System.out.println("arry elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,2,5,15,20};
        int n = 5;
        rotateByOneFun(arr,n);

    }
}
