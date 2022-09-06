package com.bridgelabz;

import java.util.Scanner;

public class DayOneAssignment {
    public static void main(String[] args) {
        DayOneAssignment dayOneAssignment=new DayOneAssignment();
        dayOneAssignment.rectangle();
    }
    public void rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Length & Breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int areaOfRectangle = length * breadth;
        System.out.println(areaOfRectangle);
        int perimeterOfRectangle = 2 * length + 2 * breadth;
        System.out.println(perimeterOfRectangle);
    }
}
