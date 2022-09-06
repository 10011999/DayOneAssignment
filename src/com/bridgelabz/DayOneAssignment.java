package com.bridgelabz;

import java.util.Scanner;

public class DayOneAssignment {
    public static void main(String[] args) {
        DayOneAssignment dayOneAssignment=new DayOneAssignment();
        dayOneAssignment.rectangle();
        dayOneAssignment.triangle();
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
    public void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hight and base");
        double hight = sc.nextDouble();
        double base =sc.nextDouble();
        double areaOfTriangle = (base * hight) / 2;
        System.out.println("Enter side,side1,base1");
        double side = sc.nextDouble();
        double side1 = sc.nextDouble();
        double base1 = sc.nextDouble();
        double perimeterOfTrangle = side + side1 + base1;
        System.out.println("Area of triangle " +areaOfTriangle+ " Perimeter of trangle " +perimeterOfTrangle);
    }
}
