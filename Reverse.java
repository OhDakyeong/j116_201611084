import java.lang.StringBuffer;
class Reverse{
  static String s="hello";
  static StringBuffer sb= new StringBuffer(s);
  public static void main(String[] args){
    System.out.print(sb);
    System.out.print("->");
    sb.reverse();
    System.out.println(sb);
  }
}