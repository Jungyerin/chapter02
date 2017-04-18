package com.jx372.paint.shape;

import com.jx372.paint.in.Drawable;
import com.jx372.paint.in.Resizable;

public abstract class Shape implements Drawable, Resizable{

	private String lineColor;
	private String fillColor;

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		
	}


	//public abstract void draw();

		//System.out.println("구체적인 도형을 그릴 수 없습니다.");
	 //추상메서드를 작성하면 메서드 내에 소스코드를 작성하지 않아도 된다.
	
	//추상 메서드가 하나라도 있으면 해당 클래스는 객체를 생성할 수 없다.
	
	

}
