package com.company;
public class Main {

    public static void main(String[] args) {
        int[] massiv = new int[10];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        massiv[3] = 4;
        massiv[4] = 5;
        massiv[5] = 6;
        massiv[6] = 7;
        massiv[7] = 8;
        massiv[8] = 9;
        massiv[9] = 10;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                System.out.print(massiv[i] + " ");
            }
        }
    }
}
