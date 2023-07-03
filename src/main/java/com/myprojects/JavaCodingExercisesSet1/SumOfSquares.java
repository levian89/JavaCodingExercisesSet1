package com.myprojects.JavaCodingExercisesSet1;

public class SumOfSquares {
    public static void main(String[] args) {
        SumOfSquares sumOfSquares = new SumOfSquares();
        System.out.println(sumOfSquares.calculateSumOfSquares(1));
    }
    public long calculateSumOfSquares(int n) {
        // write your code here
        if(n<0) {
            return -1;
        }
        long sum = 0;
        for(int i=0; i<=n; i++) {
            sum = sum + i*i;
        }
        return sum;
    }
}
