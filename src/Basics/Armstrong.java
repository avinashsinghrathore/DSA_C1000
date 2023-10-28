package Basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            sum = sum + (r*r*r);
            n = n/10;
        }
        if (temp == sum) {
            System.out.println("is armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}
