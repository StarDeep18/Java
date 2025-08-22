package com.mycompany.tutorial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tutorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            arr.add(val);
        }
        int maxLength = 0;
        for (int val : arr) {
            int length = String.valueOf(val).length();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        System.out.print("New array : [");
        for (int i = 0; i < arr.size(); i++) {
            String padded = String.format("%0" + maxLength + "d", arr.get(i));
            System.out.print(padded);
            if (i != arr.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        for (int j = 0; j < arr.size(); j++) {
            sum = sum + arr.get(j);
        }
        System.out.println("The sum is : " + sum);
    }
}