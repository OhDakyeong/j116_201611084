class DiceGame{
Player p1;
Player p2;
public void startGame() {
p1=new Player("A");
p2=new Player("B");
p1.play();
p2.play();
if (p1.getNum() > p2.getNum()) {
System.out.println(p1.getName()+" won with score "+p1.getNum());
}
else if (p1.getNum()==p2.getNum()){
System.out.println("Draw with "+p1.getNum());
}
else
{System.out.println(p2.getName()+" won with score "+p2.getNum());
}
}
}
