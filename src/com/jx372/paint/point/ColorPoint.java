package com.jx372.paint.point;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint(int x, int y, String color){
		
		super(x,y); //set을 이용하지 않고 부모의 것을 받는 super를 사용한다.
		this.color=color;
		
	}	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void show()
	{
		///완전재정의		
		System.out.println("점[x="+getX()+
				",y="+getY()+
				" color="+color+"]을 그렸습니다.");
	}//부모의 메소드가 무시되고 완전재정의된 show메소드가 실행된다. 오버라이드
	
	
	
	
	

}
