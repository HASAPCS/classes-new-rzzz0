package com.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

        // TODO: Initialize the length and width
    }

    public double area() {
        // TODO: Calculate and return the area of the rectangle
        return this.length * this.width;  // Change this default return statement
    }

    public double perimeter() {
        
        // TODO: Calculate and return the perimeter of the rectangle
        return this.length*2 + this.width*2;  // Change this default return statement
    }
}
