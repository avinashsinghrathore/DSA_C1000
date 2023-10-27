package Array;
import java.util.Scanner;

public class LinearSearch {

    static int isFound (int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,5,2,6,8};
        int target = 80;
        int ans = isFound(arr, target);
        System.out.println(ans);        
    }
}
