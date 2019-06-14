package com.JavaLessons.Nik;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;

    }

    public void setSideA(double a) {
        this.sideA = a;
    }

    public void setSideB(double b) {
        this.sideB = b;
    }

    public void setSideC(double c) {
        this.sideC = c;
    }

    public double triangleArea() {
       double p = (sideA + sideB + sideC)/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB)* (p - sideC));
    }

    public static void main(String[] args) {
        Triangle tri1 = new Triangle(1, 5, 9);

        System.out.println(tri1.triangleArea());
        tri1.setSideA(5.3);
        tri1.setSideB(7.9);
        tri1.setSideC(5.7);
        System.out.println(tri1.triangleArea());

    }
}
