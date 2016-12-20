package com.sd.Final;

public class PlayerFinal {
	public String name = null; 
	int score=0;
	int num=0;
	
	public PlayerFinal(String _name){
		name=_name;
	}
	
	public void play() {
		DiceFinal df=new DiceFinal();
		df.roll();
		num+=df.getNum();
		score+=num;
	}
	
	public int getScore(){
		return this.num;
	}
	
	public String getName(){
		return this.name;
	}
}
