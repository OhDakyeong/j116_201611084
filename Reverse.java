import java.lang.StringBuffer;
class Reverse{
  static String s="hello";
  static StringBuffer sb= new StringBuffer(s);
  public static void main(String[] args){
    sb.reverse();
    System.out.println(sb);
  }
}