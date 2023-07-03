package com.myprojects.JavaCodingExercisesSet1;

public class ExamResult {
    public static void main(String[] args) {
        ExamResult examResult = new ExamResult();
        System.out.println(examResult.isPass(50));
    }

    public boolean isPass(int marks) {

        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        // if(marks>50){
        //     return true;
        // }
        // return false;
        // or
        return marks > 50;
    }
}