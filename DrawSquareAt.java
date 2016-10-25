import ch.aplu.turtle.*;

public class DrawSquareAt{
  static Turtle t1=new Turtle();
  public static void drawSquareAt(int size,double x,double y) {
    t1.penUp();
    t1.moveTo(x,y);
    t1.penDown();
    for(int i=0;i<4;i++) {
      t1.forward(size);
      t1.right(90);
    }
  }
  public static void main(String[] args) {
    drawSquare(100,-100,50);
  }
}