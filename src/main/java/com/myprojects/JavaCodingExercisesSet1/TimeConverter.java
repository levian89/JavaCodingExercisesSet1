package com.myprojects.JavaCodingExercisesSet1;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println(TimeConverter.convertDaysToMinutes(2));
    }

    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if(hours>=0) {
            return hours*60;
        }
        return -1;
    }

    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if(days>=0) {
            return days*24*60;
        }
        return -1;
    }
}
