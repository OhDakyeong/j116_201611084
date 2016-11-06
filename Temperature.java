public class Temperature {
	public static void convert(float temp,String s){
		float t;
		if(s.equals("F")){
			t=(temp-32)/1.8f;
			System.out.println(temp+s+" is "+t+"C");
		}
		else if(s.equals("C")){
			t=(temp*1.8f)+32;
			System.out.println(temp+s+" is "+t+"F");
		}
	}
	public static void main(String[] args){
		Temperature t=new Temperature();
		t.convert(38, "C");
		t.convert(100, "F");
	}
}
