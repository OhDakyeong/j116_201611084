class Hello {
String toWhom=" world";
void sayHello() {
System.out.println("Hello"+toWhom);
}
}

Hello h=new Hello()


class Subway {
String m=" line runs";
int line;
void run(){
System.out.println(line+m);
}
void setLine(int l) {
line=l;
}
}

Subway mySub=new Subway();

mySub.setLine(5)
