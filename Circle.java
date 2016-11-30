package com.sd.ch8;

public class Circle extends Point {
  private double radius;
  public double getArea;
  public Circle(int x, int y, double r){
    super(x,y);
    this.radius=r;
  }
  public double getArea(){
    return getArea=radius*radius*Math.PI;
  }
  public static void main(String[] args){
    Circle myCircle=new Circle(10,10,5);
    double myArea=myCircle.getArea();
    System.out.println(myArea);
  }
}