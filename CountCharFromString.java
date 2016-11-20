import java.util.Map;
import java.util.HashMap;

class CountCharFromString{
  Map<String,Integer> w=new HashMap<String,Integer>();
  void countChar(char[] word){
    String s;
    for(char c: word){
      s=Character.toString(c);
      if(w.containsKey(s)){
        w.put(s,w.get(s)+1);
      }
      else{
        w.put(s,1);
      }
    }
    System.out.println(w);
  }
  public static void main(String[] args){
    char[] words="sangmyung university".toCharArray();
    CountCharFromString cc=new CountCharFromString();
    cc.countChar(words);
  }
}