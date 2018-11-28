package com.dotka;

public class Circle extends Shape{

    public final double PI = 3.141;

    public Circle(double radius) {
        super(radius, 0);
    }

    @Override
    public double calculateSurface(){
        return  PI * parA * parA;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * PI * parA;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "[" + parA + "], surface: " + calculateSurface() + ", perimeter: " + calculatePerimeter();
    }


}

