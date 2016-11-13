import java.util.ArrayList;

public class SumArray {
	int sum=0;
	void Sum(){
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<1000;i++){
			if(i%4==0 && i%5!=0){
				list.add(i);
			}
		}
		for(int s:list){
			sum+=s;
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		SumArray s=new SumArray();
		s.Sum();
	}
}
