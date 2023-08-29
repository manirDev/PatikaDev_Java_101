package com.manirdev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                            {2, 3, 4},
                            {5, 6, 4}
                        };
        System.out.println("Initial Matrix: ");
        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
        int[][] transpose = helper(matrix);
        System.out.println("Transpose: ");
        for (int[] row : transpose){
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] helper(int[][] matrix){
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}