import ch.aplu.turtle.*;

public class DrawTriangle {
  static Turtle t1=new Turtle();
  public static void drawTriangle(int size) {
    for(int i=0;i<3;i++) {
      t1.forward(size);
      t1.right(120);
    }
  }
  public static void main(String[] args) {
    DrawTriangle t1=new DrawTriangle();
    t1.drawTriangle(100);
  }
}