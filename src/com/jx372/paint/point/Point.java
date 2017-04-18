package com.jx372.paint.point;

import com.jx372.paint.in.Drawable;

public class Point implements Drawable {
	
	private int x;
	private int y;
	
	public Point(){
		
	}
	
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show(){
		System.out.println("점[x="+x+",y="+y+"]을 그렸습니다.");
	}
	
	public void disapear(){
		System.out.println("점[x="+x+",y="+y+"]을 지웠습니다.");
	}
	
	public void show(boolean visible){
		if(visible==true)
		{
			show(); //오버로딩된 두개의 show매서드가 존재하면 자식에게 오버라이등 할때 두개의 메서드를 실행해주어야 하므로 중복을 줄여준다.
			//System.out.println("점[x="+x+",y="+y+"]을 그렸습니다.");
		}else{
			System.out.println("점[x="+x+",y="+y+"]을 지웠습니다.");
		}
	}

	@Override
	public void draw() {
		show();		
	} //인터페이스를 이용하여 만든 코드 간단화
	
	

}
