package com.sovani.dailyproblem;

public class Day2Problem {
    public static void main(String[] args) {
        // write your code here
        int[] params = new int[4];
        params[0] = 10;
        params[1] = 20;
        params[2] = 1;
        params[3] = 3;
        Day2Problem.getUpdatedArray(params);
    }
    public static int[] getUpdatedArray(int[] dataarray){
        int[] retArray = new int[dataarray.length];
        for (int j = 0; j < dataarray.length; j++) {
            boolean first_value = true;
            int k = 0;
            for (int i = 0; i < dataarray.length; i++) {
                if (i != j) {
                    if (first_value) {
                        k = dataarray[i];
                        first_value = false;
                        continue;
                    }
                    k = k * dataarray[i];
                }
            }
            retArray[j] = k;
        }
        return retArray;
    }
}
