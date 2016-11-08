public class LeapYear {
	public static void leapYear(int year){
		if(((year%4==0) && (year%100!=0)) || (year%400==0)){
			System.out.println(year+" is a leap year");
		}
		else{
			System.out.println(year+" is not a leap year");
		}
	}
	public static void main(String[] args){
		LeapYear y=new LeapYear();
		y.leapYear(1800);
		y.leapYear(2016);
		y.leapYear(1985);
	}

}