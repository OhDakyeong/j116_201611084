public class NineNine {
	static int[] x={1,2,3,4,5,6,7,8,9};
	public static void multiply(){
		for(int i:x) {
			System.out.printf("\n%d´Ü -",i);
			for(int j:x) {
				System.out.printf("\t%dx%d=%2d",i,j,i*j);
			}
		}
	}
	public static void main(String[] args){
		int[] x={1,2,3,4,5,6,7,8,9};
		NineNine calc=new NineNine();
		calc.multiply();
	}

}
