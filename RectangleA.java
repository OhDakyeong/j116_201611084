package com.sd.ch8;

class RectangleA extends ShapeA{
  private double width;
  private double height;
  private double area;
  private double perimeter;
  
  public double calcArea(double width, double height){
    this.width = width;
    this.height = height;
    return (width*height);
  }
  public double calcPerimeter(double width, double height) {
    this.width=width;
    this.height=height;
    return 2*(width+height);
  }
  public static void main(String[] args) {
    ShapeA s = new RectangleA();
    s.calcArea(5.0,8.0);
    s.calcPerimeter(5.0,8.0);
  }
}