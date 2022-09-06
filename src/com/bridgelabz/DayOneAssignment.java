package com.bridgelabz;

import java.util.Scanner;

public class DayOneAssignment {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DayOneAssignment dayOneAssignment = new DayOneAssignment();
        System.out.println("Enter a number");
        int inupt = sc.nextInt();
        switch (inupt) {
            case 1:
                dayOneAssignment.rectangle();
                break;
            case 2:
                dayOneAssignment.triangle();
                break;
            case 3:
                dayOneAssignment.circle();
                break;
            default:
                System.out.println("Not information this cases");
                break;
        }
    }

    public void rectangle() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Length & Breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int areaOfRectangle = length * breadth;
        System.out.println(areaOfRectangle);
        int perimeterOfRectangle = 2 * length + 2 * breadth;
        System.out.println(perimeterOfRectangle);
    }

    public void triangle() {
        System.out.println("Enter a hight and base");
        double hight = sc.nextDouble();
        double base = sc.nextDouble();
        double areaOfTriangle = (base * hight) / 2;
        System.out.println("Enter side,side1,base1");
        double side = sc.nextDouble();
        double side1 = sc.nextDouble();
        double base1 = sc.nextDouble();
        double perimeterOfTrangle = side + side1 + base1;
        System.out.println("Area of triangle " + areaOfTriangle + " Perimeter of trangle " + perimeterOfTrangle);
    }

    public void circle() {
        double PI = 3.14;
        System.out.println("Enter a radius");
        double radius = sc.nextDouble();
        double areaOfCircle = PI * (radius * radius);
        double perimeterOfCircle = 2 * PI * radius;
        System.out.println("Area of circle " + areaOfCircle + "Perimeter of circle " + perimeterOfCircle);

    }
}
