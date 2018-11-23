package com.sovani.dailyproblem;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class Day1Problem {

    public static void main(String[] args) {
	// write your code here
        int[] params = new int[4];
        params[0] = 10;
        params[1] = 20;
        params[2] = 1;
        params[3] = 3;
        System.out.println(Day1Problem.checkSumMatchesAnyTwo(params, 11));
    }
    public static boolean checkSumMatchesAnyTwo(int[] dataarray, int matchValue){
        boolean retVal = false;
        for (int j = 0; j < dataarray.length; j++) {
            for (int i = 0; i < dataarray.length; i++) {
                if (i == j) continue;
                if (i < j) continue;
                if (matchValue == dataarray[j] + dataarray[i]) {
                    System.err.println("Matched " + dataarray[j] + " and " + dataarray[i] );
                    retVal = true;
                    break;
                }
            }
        }
        return retVal;
    }
}
