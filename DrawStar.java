import ch.aplu.turtle.*;

public class DrawStar {
  static Turtle t1=new Turtle();
  public static void drawStar(int size) {
    for(int i=0;i<5;i++) {
      t1.forward(size);
      t1.right(144);
    }
  }
  public static void main(String[] args) {
    DrawStar t1=new DrawStar();
    t1.drawStar(100);
  }
}