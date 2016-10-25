import ch.aplu.turtle.*;
import java.util.Scanner;
public class DrawTriangleOrSquare{
  static Turtle t1=new Turtle();
  String name;
  int size;
  DrawTriangleOrSquare(String name,int size){
    this.name = name;
    this.size = size;
  }
  void drawTriangleOrSquare() {
    switch(name){
    case "Triangle" :
      System.out.println("Triangle");
      for(int i=0;i<3;i++) {
        t1.forward(size);
        t1.right(120);
    }
      break;
    case "Square" :
      System.out.println("Square");
        for(int i=0;i<4;i++) {
          t1.forward(size);
          t1.right(90);
    }
      break;
    }  
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String nameA;
    System.out.println("please set name :");
    nameA = scanner.nextLine();
    DrawTriangleOrSquare d = new DrawTriangleOrSquare(nameA,100);
    d.drawTriangleOrSquare();
  }
}