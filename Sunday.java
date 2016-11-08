import java.util.Calendar;

public class Sunday {
	public static void count(){
		int s=0;
		Calendar c=Calendar.getInstance();
		for(int y=1901;y<=2000;y++){
			for(int m=1;m<=12;m++){
				c.set(y, m,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					s+=1;
				}
			}
		}
		System.out.println("First day of Month on 20 Century : "+s);
	}
	public static void main(String[] args){
		Sunday day=new Sunday();
		day.count();
	}
}
