package com.shanmeng.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(10);
        System.out.println(result);
        for (int i = 0; i < 10; i++) {
            System.out.println(result.get(i));
        }

    }

    /**
     * This method first generate a pascal triangle in a 2-d array, then convert the array to List.
     */
    public static List<List<Integer>> generate1(int numRows) {
        int[][] triangle = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }

            }
        }

        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        for (int i = 0; i < triangle.length; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                row.add(triangle[i][j]);
            }
            myList.add(row);

        }

        return myList;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            myList.add(row);

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int temp = myList.get(i - 1).get(j - 1) + myList.get(i - 1).get(j);
                    row.add(temp);
                }

            }
        }

        return myList;

    }

}
