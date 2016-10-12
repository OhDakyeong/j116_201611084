
class Dice {
private int number=0;
public void roll(){
number=(int)(Math.random()*6+1);
System.out.println("You got "+number);
}
public int getNum(){
return this.number;
}
}
