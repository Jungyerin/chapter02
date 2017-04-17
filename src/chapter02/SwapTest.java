package chapter02;

public class SwapTest {
	
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		System.out.println(a+","+b);
		swap(a,b); //호출된 후 v1,v2,temp값을 모두 pop하지만 a,b는 아직 스택에 들어있고 값이 바뀌지 않음 함수로 값을 넘겨도 바뀌지 않고 객체로 값을 넘겨야 됨.
		
		/*int temp=a;
		a=b;
		b=temp;*/
		System.out.println(a+","+b);
		
		//---------------------------------------------------------------------------------------------------
		
		Value val1=new Value();  	//인스턴스변수는 초기화가 됨(지역변수는 초기화가 되지 않아서 반드시 초기화를 시켜줘야됨.)
		val1.v=10;  				//레퍼런스값이 val1에 저장 val1은 지역변수
		Value val2=new Value();
		val2.v=20;
		
		System.out.println(val1.v+","+val2.v);
		swap(val1,val2);
		System.out.println(val1.v+","+val2.v);
	}
	
	public static void swap(Value v1,Value v2)
	{
		int temp=v1.v;
		v1.v=v2.v;
		v2.v=temp;
	}
	
	public static void swap(int v1,int v2)
	{
		int temp;		
		temp=v1;
		v1=v2;
		v2=temp;
	}
}
