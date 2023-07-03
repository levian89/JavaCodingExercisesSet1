package com.myprojects.JavaCodingExercisesSet1;

public class LeapYearChecker {

    public static void main(String[] args) {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        System.out.println(leapYearChecker.isLeapYear(-400));
    }

    public boolean isLeapYear(int year) {
//        if(year<1) {
//            return false;
//        }

        // 2041 - No
        if(year%4 != 0) {
            return false;

        // 2048 - Yes
        }
        if(year % 100 != 0) {
            return true;
        }

        if(year % 400 == 0) {
            //2000, 2400 - Yes
            return true;
        }
        //2100, 2200, 2300 - No
        return false;
    }
}