package com.sd.Final;

public class DiceFinal {
  private int number=0;
  public String yut=null;
  public void roll() {
    number=(int)(Math.random()*5+1);
    if(number==1){
      yut=" ��";
    }
    else if(number==2){
      yut=" ��";
    }
    else if(number==3){
      yut=" ��";
    }
    else if(number==4){
      yut=" ��";
    }
    else if(number==5){
      yut=" ��";
    }
    System.out.println(number+yut);
  }
  public int getNum(){
    return this.number;
  }
  
}