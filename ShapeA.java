package com.sd.ch8;

public abstract class ShapeA {
  public String name="Shape";
  public abstract double calcArea(double width,double height);
  public abstract double calcPerimeter(double width,double height);
  public String getName(){
    return this.name;
  }
  public String toString() {
    return "Shape..."+super.toString();
  }
}