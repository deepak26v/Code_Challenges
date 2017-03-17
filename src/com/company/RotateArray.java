package com.company;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int rotationCount = in.nextInt();
        int[] rotatedArr = new int[size];

        for(int i = 0; i < size; i++) {
            if(rotationCount > i) {
                rotatedArr[size - rotationCount + i] = in.nextInt();
            } else {
                rotatedArr[i - rotationCount] = in.nextInt();
            }
        }

        for(int i = 0; i < size; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}
