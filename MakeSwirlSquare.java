import ch.aplu.turtle.*;

public class MakeSwirlSquare {
	static Turtle t=new Turtle();
	public static void makeSwirlSquare(int size, int bigger, int turns, int angle){
		int nBigger=2;
		for(int i=0;i<turns;i++){
			if(i%nBigger!=0){
				size+=bigger;
			}
			t.forward(size);
			t.right(angle);
		}
	}
	public static void main(String[] args){
		makeSwirlSquare(30,10,20,90);
	}

}
