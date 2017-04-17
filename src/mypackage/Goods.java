package mypackage;

public class Goods {
	public final static float DISCOUNT_RATE=0.2f;
	public static int countOfGoods; //클래스변수는 클래스 이름으로 접근해야하지만 같은 클래스에서는 바로 접근가능
	
	public String name; 	//public
	protected int price; 	//같은 패키지+자식
	int countStock; 		//같은패키지
	private int countSold; 	//같은 클래스 내부
	
	
	public Goods(){   //기본생성자를 만들지 않으면 컴파일러가 기본생성자(파라미터가 없이)를 만들어줌.
		
		countOfGoods++;
	}
	
	public void setPrice(int price)
	{
		if(price<0)
		{
			price=0;
		}
	}//외부에서 get set을 통해서 값을 수정하게 함으로써 은닉화를 해준다.(캡슐화)
	
	public void setCoundSold(int countSold)
	{
		this.countSold=countSold;  //this=객체자신을 의미
	} //리턴값이 없고 매개변수가 있는 메소드
	
	public int getCountSold(){
		return countSold;
	}//리턴값은 있지만 매개변수가 없는 메소드
	
	public void showInfo(){
		System.out.println("이름 : "+name+
				", 가격 : "+price+
				",재고량 : "+countStock+
				",판매량 : "+countSold);		
	} //리턴값이 없고 매개변수도 없는 메소드
	
	public int calcDiscountPrice(int percentage)
	{
		int discountPrice=price*percentage/100;
		
		return discountPrice;
	}//리턴값도 있고 매개변수도 있는 메소드
	
	

}
