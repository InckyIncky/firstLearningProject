package com.JavaLessons.Nik;

public class AreaOfACircle {

    private static final double PI = 3.1415926536;
    double radius;

    AreaOfACircle(double radius) {
        double r = this.radius;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double areaOfCircle() {
        return PI * radius * radius;

    }

    public static void main(String[] args) {
        AreaOfACircle circle1 = new AreaOfACircle(5.8 );
        System.out.println(circle1.areaOfCircle());

        circle1.setRadius(5);
        System.out.println(circle1.areaOfCircle());
        circle1.setRadius(10);
        System.out.println(circle1.areaOfCircle());
    }
}
