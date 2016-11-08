public class PrintTriangle {
	String s=" ";
	String p="#";
	StringBuffer sbuf=new StringBuffer();
	void printTriangle(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10-i;j++){
				sbuf.append(s);
			}
			for(int j=0;j<i*2+1;j++){
				sbuf.append(p);
			}
			System.out.printf("%s\n",sbuf.toString());
			sbuf.delete(0,sbuf.length());
		}
	}
	public static void main(String[] args){
		PrintTriangle triangle=new PrintTriangle();
		triangle.printTriangle();
	}
}
