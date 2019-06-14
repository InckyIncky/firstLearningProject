package com.JavaLessons.Nik;

public class Circle {

    private static final double PI = 3.1415926536;
    double radius;

    Circle(double radius) {
        double r = this.radius;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double areaOfCircle() {
        return PI * radius * radius;

    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.8 );
        System.out.println(circle1.areaOfCircle());

        circle1.setRadius(5);
        System.out.println(circle1.areaOfCircle());
        circle1.setRadius(10);
        System.out.println(circle1.areaOfCircle());
    }
}
