package com.example.user.testapp;

/**
 * Created by Blaize on 2017/10/26.
 */

public class Solution {

    private static final int NUM_ARRAY_LENGTH = 10;

    public static int solution(int N){
        String input = Integer.toString(N);
        int length = input.length();
        int[] numArray = new int[NUM_ARRAY_LENGTH];
        int similarItems = factorial(length);

        for(int i = 0; i < input.length(); i++){
            numArray[Integer.valueOf(String.valueOf(input.charAt(i)))]++;
        }

        for(int j = 0; j < numArray.length; j++){
            similarItems = similarItems/factorial(numArray[j]);
        }
        return similarItems;
    }

    public static int factorial(int input){
        int sum = 1;
        for(int i = input; i >= 1; i--){
            sum = sum * i;
        }
        return sum;
    }
}
