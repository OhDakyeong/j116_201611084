brazil.roast();
class BrazilCoffee {
String origin;
BrazilCoffee(String o){
origin=o;
}
public void roast() {
System.out.println("roasting.."+origin);
}
public void brew() {
System.out.println("brewing.."+origin);
}
public void grind() {
System.out.println("grinding.."+origin);
}
}
BrazilCoffee brazil=new BrazilCoffee("Brazil");
brazil.roast();