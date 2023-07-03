package com.myprojects.JavaCodingExercisesSet1;


import java.util.Scanner;

public class PerfectNumberChecker {

    public static void main(String[] args) {
        PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
        System.out.println(perfectNumberChecker.isPerfectNumber(6));

        //calling the is perfect method from a non-static context
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        long number = scanner.nextLong();
        PerfectNumberChecker perfectNumberChecker1 = new PerfectNumberChecker();
        long s = perfectNumberChecker1.isPerfect(number);
        if (s==number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

        //calling the is perfect method from a static context
        System.out.println("Enter the number:");
        long number1 = scanner.nextLong();
        long s1 = isPerfect1(number1);
        if (s1==number1) {
            System.out.println(number1 + " is a perfect number");
        } else {
            System.out.println(number1 + " is not a perfect number");
        }
    }

    public long isPerfect(long number) {

        long divisorSum = 0;
        for (int i = 1; i<number; i++) {
            if (number%i==0) {
                divisorSum += i;
            }
        }
        return divisorSum;
    }

    public static long isPerfect1(long number) {

        long divisorSum = 0;
        for (int i = 1; i<number; i++) {
            if (number%i==0) {
                divisorSum += i;
            }
        }
        return divisorSum;
    }

    public boolean isPerfectNumber(int number) {
        if(number<=0) {
            return false;
        }

        int divisorSum = 0;
        for(int i = 1; i<number; i++) {
            if(number%i == 0) {
                divisorSum += i;
            }
        }

        if(divisorSum == number) {
            return true;
        }
        return false;
    }
}