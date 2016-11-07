public class RSP {
	public static void rspPlay(String u1,String u2){
		String sel1=u1;
		String sel2=u2;
		String a="Winner is u1";
		String b="Winner is u2";
		if(sel1.equals(sel2)){
			System.out.println("u1:"+sel1+" u2:"+sel2+" Draw");
		}
		else if(sel1.equals("r")){
			if(sel2.equals("p")){
				System.out.println("u1:"+sel1+" u2:"+sel2+" "+b);
			}
			else if(sel2.equals("s")){
				System.out.println("u1:"+sel1+" u2:"+sel2+" "+a);
			}
		}
		else if(sel1.equals("s")){
			if(sel2.equals("r")){
				System.out.println("u1:"+sel1+" u2:"+sel2+" "+b);
			}
			else if(sel2.equals("p")){
				System.out.println("u1:"+sel1+" u2:"+sel2+" "+a);
			}
		}
		else if(sel1.equals("p")){
			if(sel2.equals("r")){
				System.out.println("u1:"+sel1+" u2:"+sel2+" "+a);
			}
			else if(sel2.equals("s")){
				System.out.println("u1:"+sel1+" u2:"+sel2+" "+b);
			}
		}
	}
	public static void main(String[] args){
		String[] sel1={"r","s","p"};
		String[] sel2={"r","s","p"};		
		RSP player=new RSP();
		player.rspPlay("r", "s");
		player.rspPlay("p", "p");
	}

}
