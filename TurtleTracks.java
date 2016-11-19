import ch.aplu.turtle.*;
import java.util.ArrayList;

public class TurtleTracks{
  Turtle t=new Turtle();
  ArrayList<Double[]> posArr = new ArrayList<Double[]>();
  Double[] pos=new Double[2];
  void drawSquareAtSave(int size, double x, double y){
    t.penUp();
    t.moveTo(x,y);
    t.penDown();
    for(int i=0;i<4;i++){
      pos[0]=t.getX();
      pos[1]=t.getY();
      posArr.add(pos);
      t.forward(size);
      t.right(90);
    }
    for(Double[] d:posArr){
      System.out.printf("(%.1f,%.1f)",d[0],d[1]);
    }
  }
  public static void main(String[] args){
    TurtleTracks tt=new TurtleTracks();
    tt.drawSquareAtSave(80,0,20);
  }
}
