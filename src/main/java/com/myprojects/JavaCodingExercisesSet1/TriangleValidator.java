package com.myprojects.JavaCodingExercisesSet1;

public class TriangleValidator {
    public static void main(String[] args) {
        TriangleValidator triangleValidator = new TriangleValidator();
        System.out.println(triangleValidator.isValidTriangle(90,1,89));
        System.out.println(triangleValidator.isRightAngled(30,40,50));
    }
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        return ((angle1>0 && angle2 >0 && angle3 >0) && (angle1+angle2+angle3==180));
    }

    public boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
        if(side1<=0 || side2<=0 || side3<=0) {
            return false;
        }
        if((side1*side1 == side2*side2 + side3*side3) || (side2*side2 == side1*side1 + side3*side3)
                || (side3*side3 == side2*side2 + side1*side1)) {
            return true;
        }
        return false;
    }

}