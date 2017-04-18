package chapter02;

import mypackage.Goods;

public class GoodsApp {
	public final static int Count_Goods=3;

	public static void main(String[] args) {
		
		Goods camera=new Goods();
		camera.name="nikon";		//public은 제한이 없다
		//camera.price=400000;   	//디폴트는 같은 패키지에서만 접근가능
		//camera.countStock=30;		//protected는 같은 패키지 또는 자식에서만 접근가능
		//camera.countSold=50;		//pivate는 같은 클래스 내부에서만 사용가능
		Goods[] goods=new Goods[Count_Goods];
		
		System.out.println("이름 : "+camera.name/*+
							", 가격 : "+camera.price+
							",재고량 : "+camera.countStock+
							",판매량 : "+camera.countSold*/);    //객체끼리 왜 더하지?
		
		camera.showInfo();
		
		camera.setCoundSold(10);
		
		System.out.println(camera.getCountSold());
		
		camera.setPrice(-10000);
		
	

	}

}
