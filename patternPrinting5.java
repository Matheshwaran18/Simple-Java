package com.mathesh.loopingStatements;

import java.util.Scanner;

public class patternPrinting5 {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=(n+(n-1));i++){
            for (int j=1;j<=(n+(n-1));j++){
                if (j == n) {
                    System.out.print("*");
                }else if(i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();


        }
    }
}
