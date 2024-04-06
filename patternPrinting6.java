package com.mathesh.loopingStatements;
import java.util.Scanner;


public class patternPrinting6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for (i = 1; i <= num; i++) {
            // Print numbers based on the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        int value=i;
        for (int j = num-1; j >= 1; j--) {
            for (int k =1; k <=j ; k++) {
                System.out.print(value*k+" ");
            }
            System.out.println();
            value++;
        }
    }
}
