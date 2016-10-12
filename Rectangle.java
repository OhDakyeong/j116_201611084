public class Rectangle {
private int height
;
private int width;
public Rectangle(int h, int w){
this.height=h;
this.width=w;
}
public int getHeight(){
return height;
}
public int getWidth(){
return width;
}
public void setArea(int h, int w){
setHeight(h);
setWidth(w);
}
public int calcArea() {
return height*width;
}
}
