package com.mathesh.loopingStatements;

import java.util.Scanner;

public class patternPrinting2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int len=str.length();
        System.out.println(str);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(i==j){
                    System.out.print(str.charAt(i));
                } else if (i+j==len-1) {
                    System.out.print(str.charAt(j));
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
