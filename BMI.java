public class BMI {
	public static void computeBMI(double height,double weight){
		double bmi=weight/(height*height);
		System.out.println(bmi);
		if(bmi<18.5){
			System.out.println("Low");
		}
		else if(18.5<=bmi && bmi<23){
			System.out.println("Normal");
		}
		else if(23<=bmi && bmi<25){
			System.out.println("Risky");
		}
		else if(25<=bmi && bmi <30){
			System.out.println("Obesty 1");
		}
		else if(30<=bmi && bmi <40){
			System.out.println("Obesty 2");
		}
		else if(bmi>=40){
			System.out.println("Obesty 3");
		}
		else
			System.out.println("ERROR");
	}
	public static void main(String[] args){
		BMI person=new BMI();
		person.computeBMI(1.7, 75);
	}
}
