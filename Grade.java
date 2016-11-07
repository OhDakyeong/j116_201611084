public class Grade {
	public static void computeGrade(double marks){
		char grade;
		double score=marks;
		if(90<=score && score<=100){
			System.out.println("Your score is "+score);
			System.out.println("Grade is A");
		}
		else if(80<=score && score <90){
			System.out.println("Your score is "+score);
			System.out.println("Grade is B");
		}
		else if(70<=score && score <80){
			System.out.println("Your score is "+score);
			System.out.println("Grade is C");
		}
		else if(60<=score && score <70){
			System.out.println("Your score is "+score);
			System.out.println("Grade is D");
		}
		else if(0<=score && score <60){
			System.out.println("Your score is "+score);
			System.out.println("Grade is F");
		}
		else{
			System.out.println("Your input is "+score+", It is not a score");
		}
	}
	public static void main(String[] args){
		Grade g=new Grade();
		g.computeGrade(95);
		g.computeGrade(87.5);
		g.computeGrade(74.32);
		g.computeGrade(60.4);
		g.computeGrade(59.99);
		g.computeGrade(105.2);
	}

}
