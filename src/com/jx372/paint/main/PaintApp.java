package com.jx372.paint.main;

import com.jx372.paint.in.Drawable;
import com.jx372.paint.in.Resizable;
import com.jx372.paint.point.ColorPoint;
import com.jx372.paint.point.Point;
import com.jx372.paint.shape.Circle;
import com.jx372.paint.shape.Rect;
import com.jx372.paint.shape.Shape;
import com.jx372.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point1 = new Point(); // 생성자 생성으로 기본생성자가 적용되지 않아서 error
		Point point2 = new Point(100, 50); // 생성자 오버로딩으로 기본생성자로 사용도 가능하며 파라미터 값을
											// 가지는 생성자도 사용가능하다.

		point1.setX(10);
		point1.setY(20);
		// point2.setX(100);
		// point2.setY(50);

		//point1.show(); 
		point1.draw();
		//point2.show();
		point2.draw();
		//point1.show(false);

		Point point3 = new ColorPoint(50, 80, "red");

		//point3.show(true);
		point3.draw();

	/*	Shape s = new Rect();
		s.draw();*/

		/*
		 * drawRect(new Rect()); drawCircle(new Circle());
		 */

		draw(new Rect());
		draw(new Circle());
		draw(new Triangle());
		
		instanceofTest();

	}

	/*
	 * public static void drawRect(Rect r){ r.draw(); }
	 * 
	 * public static void drawCircle(Circle r){ r.draw(); }
	 */ // 상속을 하지 않으면 도형이 들어올때마다 새로운 메서드를 만들어서 객체를 생성해줘야 함.

	/*public static void draw(Shape s) {
		s.draw();
	} // shape만 상속 받으면 모든 도형을 만들수 있도록 함.*/
	
	public static void draw(Drawable drawable)
	{
		drawable.draw();
	}
	
	public static void resize(Drawable drawable,double r)
	{
		//리사이즈를 했는지 안했는지 찾기 위해서 instanceof를 사용
		
		if(drawable instanceof Resizable){
			Resizable resizable = (Resizable) drawable;
			resizable.resize(r);
		}
	}
	
	public static void instanceofTest(){
		
		Shape s=new Circle();
		
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		
		Rect r=new Rect();
		//클래스 경우에는 상속관계만 질의할 수 있다.
		//System.out.println(r instanceof Circle);  //부모 자식 간에만 연산이 가능하다. circle과 rect는 형제사이라서안됨
		
		//인터페이스의 경우 상관없이 모두 다 질의가 가능하다.
		
		ColorPoint pt=new ColorPoint(10, 20, "yellow");
		System.out.println(pt instanceof Resizable);
		System.out.println(pt instanceof Drawable);
		System.out.println(pt instanceof Point);
		System.out.println(pt instanceof ColorPoint);
		
	}

}
