package com.sd.ch8;
import java.util.*;

public class Selection {
  Selection() {}
  ArrayList<String> selList =new ArrayList<String>();
  void select(Rectangle r) {
    r.setSelected(true);
    System.out.println("selected : "+r.isSel);
    if(r.getSelected()==true){
      String nName=r.getName();
      selList.add(nName);
    }
    System.out.println(selList);
  }
  public static void main(String[] args) {
    Selection s =new Selection();
    Rectangle r=new Rectangle();
    Cube c=new Cube();
    s.select(r);
    s.select(c);
  }
}
