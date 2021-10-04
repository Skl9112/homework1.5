package com.company;

public class Main {

    public static void main(String[] args) {
	int[][] array = {{0, 0, 0}, {3, 0, 0}, {6, 7, 0}};

        System.out.println("Our matrix: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

	    if (array[0][0] == 0 && array[0][1] == 0 && array [0][2] == 0 && array[1][1] == 0 && array[1][2] == 0 && array [2][2] == 0) {
            System.out.println("Our matrix is lower triangular matrix");
        } else {
            System.out.println("Our matrix is NOT lower triangular matrix");
        }
    }
}
