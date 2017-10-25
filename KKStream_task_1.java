package com.example.blaize.myapplication;

import java.util.Arrays;

/**
 * Created by Blaize on 2017/10/24.
 */

public class Solution {
    public int solution(int N) {
        if (N > 0) {
            double[] arrayP = new double[N];
            double[] arrayQ = new double[N];
            double[] result = new double[N*N];
            for (int i = 0; i < N; i++) {
                arrayP[i] = Math.pow(2, i);
                arrayQ[i] = Math.pow(3, i);
            }

            int index=0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    result[index] = arrayP[j]*arrayQ[k];
                    index++;
                }
            }
            Arrays.sort(result);
            return (result[N] > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (int)result[N];
        } else {
            return -1;
        }
    }
}
