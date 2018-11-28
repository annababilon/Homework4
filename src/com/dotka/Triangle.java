package com.dotka;

public class Triangle extends Shape{

    public Triangle(double side) {
        super(side, 0);
    }


    @Override
    public double calculateSurface(){
        return (parA * parA * Math.sqrt(3))/4;
    }

    @Override
    public double calculatePerimeter(){
        return parA *3;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "[" + parA + "], surface: " + calculateSurface() + ", perimeter: " + calculatePerimeter();
    }
}
